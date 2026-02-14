package com.adi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adi.entity.User;
import com.adi.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void debit(Long userId, Double amount) {
		User user = userRepository.findById(userId).orElseThrow();
		user.setBalance(user.getBalance()-amount);
		userRepository.save(user);
	}

	public void credit(Long userId, Double amount) {
		User user = userRepository.findById(userId).orElseThrow();
		user.setBalance(user.getBalance()+amount);
		userRepository.save(user);
	}

}
