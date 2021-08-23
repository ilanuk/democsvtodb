package com.example.democsvtodb.repository;

import com.example.democsvtodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
