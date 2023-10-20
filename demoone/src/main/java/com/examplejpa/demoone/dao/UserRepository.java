package com.examplejpa.demoone.dao;

import org.springframework.data.repository.CrudRepository;

import com.examplejpa.demoone.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
