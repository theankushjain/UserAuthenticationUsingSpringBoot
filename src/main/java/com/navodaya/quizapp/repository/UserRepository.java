package com.navodaya.quizapp.repository;

import com.navodaya.quizapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { //JpaRepository provides methods for performing CRUD
    User findByEmail(String email);

}
