package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.App_role;
@Repository
public interface App_roleRepo extends JpaRepository<App_role, String> {

}
