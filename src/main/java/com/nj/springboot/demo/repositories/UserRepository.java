package com.nj.springboot.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nj.springboot.demo.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
