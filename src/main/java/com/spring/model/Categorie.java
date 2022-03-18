package com.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Categorie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank @Column(unique = true)
	private String categorie;
	@OneToMany(mappedBy = "categorie")
	private Set<Produit> produits = new HashSet<Produit>();
	
	
	
	
	@Override
	public String toString() {
		return "Categorie [id=" + id + ", categorie=" + categorie + "]";
	}
	public Categorie(@NotBlank String categorie, Set<Produit> produits) {
		super();
		this.categorie = categorie;
		this.produits = produits;
	}
	public Categorie(int id, @NotBlank String categorie, Set<Produit> produits) {
		super();
		this.id = id;
		this.categorie = categorie;
		this.produits = produits;
	}
	public Categorie() {
		super();
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
}
