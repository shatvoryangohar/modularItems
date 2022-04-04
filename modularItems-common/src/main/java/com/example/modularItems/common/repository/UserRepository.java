package com.example.modularItems.common.repository;

import com.example.modularItems.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
