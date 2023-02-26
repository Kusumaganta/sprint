package com.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.entity.Role;
import com.exam.entity.User;

public interface RoleRepository extends JpaRepository<Role, Long> {

	

}
