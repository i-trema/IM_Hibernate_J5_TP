package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Produit;
@Repository
public interface ProduitRepo extends JpaRepository<Produit, Integer> {
List<Produit> findByDescription(String description);
}
