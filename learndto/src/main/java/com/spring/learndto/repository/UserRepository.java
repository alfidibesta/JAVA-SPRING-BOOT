package com.spring.learndto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.learndto.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
