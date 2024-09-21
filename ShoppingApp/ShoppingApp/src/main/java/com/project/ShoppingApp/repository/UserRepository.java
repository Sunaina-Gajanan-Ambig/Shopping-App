package com.project.ShoppingApp.repository;


import com.project.ShoppingApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}


