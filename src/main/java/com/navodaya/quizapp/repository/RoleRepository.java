package com.navodaya.quizapp.repository;

import com.navodaya.quizapp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name); //finds a role by its rolename
}
