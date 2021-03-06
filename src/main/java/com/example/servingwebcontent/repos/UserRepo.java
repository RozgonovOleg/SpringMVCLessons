package com.example.servingwebcontent.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.servingwebcontent.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
	User findByUsername(String username);

	User findByActivationCode(String code);

}
