package com.adi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "User Open Api",
				version = "1.0.0",
				description = "This is User Open Api Documentation"
				),
		servers = @Server(
				url = "http://localhost:8080",
				description = "This is the url to access the User Application"
				)
		)
public class Sb20SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb20SwaggerApplication.class, args);
	}

}
