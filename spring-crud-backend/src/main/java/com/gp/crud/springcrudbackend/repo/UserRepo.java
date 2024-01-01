package com.gp.crud.springcrudbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gp.crud.springcrudbackend.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
