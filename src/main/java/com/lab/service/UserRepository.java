package com.lab.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lab.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	User findByUserId(Long id);
}