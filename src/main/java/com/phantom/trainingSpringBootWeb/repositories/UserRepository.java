package com.phantom.trainingSpringBootWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phantom.trainingSpringBootWeb.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
