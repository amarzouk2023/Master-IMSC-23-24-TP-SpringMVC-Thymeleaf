package com.marzouk.springmvc.model;

import java.io.Serializable;

public class Product implements Serializable {

	private int id;
	private String titre;
	private int prix;

	public Product() {
	}

	public Product(int id, String titre, int prix) {
		this.id = id;
		this.titre = titre;
		this.prix = prix;
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

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Product{" + "id=" + id + ", titre='" + titre + '\'' + ", prix=" + prix + '}';
	}
}
