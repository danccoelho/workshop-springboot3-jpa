package com.learnmoree.learne.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnmoree.learne.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
