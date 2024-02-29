package com.rohit.hotelbookingapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohit.hotelbookingapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	void deleteByEmail(String email);

	Optional<User> findByEmail(String email);

	boolean existsByEmail(String email);

}
