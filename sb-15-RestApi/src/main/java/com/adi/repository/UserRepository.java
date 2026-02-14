package com.adi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
