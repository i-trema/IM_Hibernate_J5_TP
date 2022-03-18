package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.App_user;
@Repository
public interface App_userRepo extends JpaRepository<App_user, String> {

}
