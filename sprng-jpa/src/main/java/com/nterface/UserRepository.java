package com.nterface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.user;

public interface UserRepository extends JpaRepository<user, Integer> {

}
