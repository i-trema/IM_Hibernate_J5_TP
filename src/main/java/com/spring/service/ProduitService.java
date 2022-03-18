package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Produit;
import com.spring.repository.ProduitRepo;

@Service
public class ProduitService {
	@Autowired
	ProduitRepo produitRepo;

	public Produit createProduit(Produit p) {
		return produitRepo.save(p);
	}

	public List<Produit> readProduits() {
		return produitRepo.findAll();
	}

	public Optional<Produit> readById(int id) {
		return produitRepo.findById(id);
	}

	public void deleteProduit(int id) {
		produitRepo.deleteById(id);
	}
	
	public List<Produit> findByDescription(String description){
		return produitRepo.findByDescription(description);
	}
}
