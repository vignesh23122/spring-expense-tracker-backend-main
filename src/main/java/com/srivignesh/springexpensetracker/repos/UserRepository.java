package com.viruchith.springexpensetracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viruchith.springexpensetracker.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findFirstByUsername(String username);
}
