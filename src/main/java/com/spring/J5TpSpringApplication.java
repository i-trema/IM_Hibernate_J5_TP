package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.App_role;
import com.spring.model.App_user;
import com.spring.model.Categorie;
import com.spring.model.Livraison;
import com.spring.model.Produit;
import com.spring.service.App_roleService;
import com.spring.service.App_userService;
import com.spring.service.CategorieService;
import com.spring.service.ProduitService;

@SpringBootApplication
public class J5TpSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(J5TpSpringApplication.class, args);
	}
	
	@Autowired
	App_roleService app_roleService;
	@Autowired
	App_userService app_userService;
	@Autowired
	CategorieService categorieService;
	@Autowired
	ProduitService produitService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categorie c1 = new Categorie(1,"périphériques", null);
		Categorie c2 = new Categorie(2, "processeurs", null);
		Produit p1 = new Produit(1,"ecran", "lcd", Livraison.non, c1);
		Produit p2 = new Produit(2, "Core i7", "OEM", Livraison.oui, c2);
		
		App_role r1 = new App_role("chef", null);
		App_role r2 = new App_role("role2", null);
		App_user u1 = new App_user("name1", 2, "pass1", null);
		App_user u2 = new App_user("name2", 0, "pass2", null);
		
		categorieService.createCategorie(c1);
		categorieService.createCategorie(c2);
		produitService.createProduit(p1);
		produitService.createProduit(p2);
		
		System.out.println(produitService.findByDescription("lcd").toString());
		System.out.println(categorieService.readById(2));
		System.out.println(app_roleService);
		
		app_roleService.createRole(r1);
		app_roleService.createRole(r2);
		app_userService.createUser(u1);
		app_userService.createUser(u2);
		
		System.out.println(app_userService.readByUsername("name1").toString());
		System.out.println(app_roleService.readRoles());
	}

}
