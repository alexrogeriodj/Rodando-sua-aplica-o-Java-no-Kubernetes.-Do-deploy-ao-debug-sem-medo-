package com.alexrogeriodj.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.alexrogeriodj.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}

