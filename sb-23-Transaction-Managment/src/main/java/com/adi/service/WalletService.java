package com.adi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class WalletService {

	@Autowired
	private UserService userService;
	
	@Transactional
	public void transfer(Long senderId,Long receiverId,Double amount) {
		userService.debit(senderId,amount);
		userService.credit(receiverId,amount);
	}
	
}
