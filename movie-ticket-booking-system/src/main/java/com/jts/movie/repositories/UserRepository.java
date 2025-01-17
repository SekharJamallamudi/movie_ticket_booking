package com.jts.movie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jts.movie.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByEmailId(String emailId);;
}
