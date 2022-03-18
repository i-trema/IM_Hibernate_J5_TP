package com.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Produit {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank @Column(unique = true)
	private String titre;
	private String description;
	@NotNull @Enumerated(EnumType.STRING)
	@Column(length = 10)
	private Livraison livraison;
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(referencedColumnName = "id", name = "id_categorie")
	private Categorie categorie;
	
	
	
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", titre=" + titre + ", description=" + description + ", livraison=" + livraison
				+ ", categorie=" + categorie.getCategorie() + "]";
	}
	public Produit(@NotBlank String titre, String description, @NotNull Livraison livraison, Categorie categorie) {
		super();
		this.titre = titre;
		this.description = description;
		this.livraison = livraison;
		this.categorie = categorie;
	}
	public Produit(int id, @NotBlank String titre, String description, @NotNull Livraison livraison,
			Categorie categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.livraison = livraison;
		this.categorie = categorie;
	}
	public Produit() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Livraison getLivraison() {
		return livraison;
	}
	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}
