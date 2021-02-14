package com.workrig.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workrig.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
