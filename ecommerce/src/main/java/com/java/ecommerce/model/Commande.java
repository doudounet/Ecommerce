package com.java.ecommerce.model;


public class Commande {
	private Integer id;
	private String libelle;
	private String datedebut;
	private String datefin;
	private String personnemaj;
	private String type;
	
	
	@Override
	public String toString() {
		return "Commande [id=" + id + ", libelle="
				+ libelle + ", datedebut=" + datedebut + ", datefin="
				+ datefin + ", personnemaj=" + personnemaj + ", type="
				+ type + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public String getPersonnemaj() {
		return personnemaj;
	}
	public void setPersonnemaj(String personnemaj) {
		this.personnemaj = personnemaj;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
