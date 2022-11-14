package com.bhawana.development.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhawana.development.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
