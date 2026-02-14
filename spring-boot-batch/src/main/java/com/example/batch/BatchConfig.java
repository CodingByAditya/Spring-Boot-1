package com.example.batch;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.batch.core.*;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Bean
	public FlatFileItemReader<User> reader() {
		return new FlatFileItemReaderBuilder<User>().name("userReader").resource(new ClassPathResource("students.csv"))
				.linesToSkip(1) // VERY IMPORTANT
				.delimited().names("id", "firstName", "lastName", "email", "gender", "contactNo", "country", "dob")
				.targetType(User.class).build();
	}
	@Bean
	public RepositoryItemWriter<User> writer(UserRepository repo) {
		RepositoryItemWriter<User> writer = new RepositoryItemWriter<>();
		writer.setRepository(repo);
		writer.setMethodName("save");
		return writer;
	}

	@Bean
	public Step step(JobRepository repo, PlatformTransactionManager tx, RepositoryItemWriter<User> writer,TaskExecutor taskExecutor) {
		return new StepBuilder("csv-step", repo)
				.<User, User>chunk(10, tx)
				.reader(reader())
				.writer(writer)
				.taskExecutor(taskExecutor)
				.throttleLimit(5)
				.build();
	}

	@Bean
	public Job job(JobRepository repo, Step step) {
		return new JobBuilder("csv-job", repo).start(step).build();
	}
	
	/*
	 * Concurrency
	 * multi threading
	 */
	@Bean
	public TaskExecutor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(5);// 5 thread has been actiave
		executor.setMaxPoolSize(10);
		executor.setQueueCapacity(100);
		executor.setThreadNamePrefix("batch-thread-");
		executor.initialize();
		return executor;
	}
	

}
