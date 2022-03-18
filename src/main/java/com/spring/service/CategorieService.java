package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Categorie;
import com.spring.repository.CategorieRepo;

@Service
public class CategorieService {
	@Autowired
	CategorieRepo categorieRepo;
	
	public Categorie createCategorie(Categorie c) {
		return categorieRepo.save(c);
	}
	
	public List<Categorie> readCategories(){
		return categorieRepo.findAll();
	}
	
	public Optional<Categorie> readById(int id){
		return categorieRepo.findById(id);
	}
	
	public void deleteCategorie(int id){
		categorieRepo.deleteById(id);
	}
}
