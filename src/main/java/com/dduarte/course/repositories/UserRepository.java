package com.dduarte.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dduarte.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
