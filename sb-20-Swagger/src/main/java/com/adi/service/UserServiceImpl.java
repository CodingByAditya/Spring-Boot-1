package com.adi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adi.entity.User;
import com.adi.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
    @Override
	public User saveUser(User user) {
		//user saving business logic----------->Create Operation
        User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUser() {
		//read operation
		List<User> allUser = userRepository.findAll();
		return allUser;
	}

	@Override
	public User updateUser(User user) {
		//update user
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer userId) {
		//delete operation
		User user = userRepository.findById(userId).get();
		userRepository.delete(user);
	}

	@Override
	public User getUserById(Integer userId) {
		//find user by id
		Optional<User> userid = userRepository.findById(userId);
		if(userid.isPresent()) {
			return userid.get();
		}
		return null;
	}

}
