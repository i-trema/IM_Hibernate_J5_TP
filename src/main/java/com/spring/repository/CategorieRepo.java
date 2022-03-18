package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Categorie;
@Repository
public interface CategorieRepo extends JpaRepository<Categorie, Integer> {

}
