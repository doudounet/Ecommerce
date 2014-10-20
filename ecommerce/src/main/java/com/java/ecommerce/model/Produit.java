package com.java.ecommerce.model;

public class Produit {
	private Integer idProduit;
	private String nomProduit;
	private double prixUnitaireProduit;
	private String descriptionProduit;
	private String shortDescriptionProduit;

	public String toString() {
		return "Produit[ nomProduit = " + nomProduit + ", idProduit = " + idProduit + ", prixUnitaireProduit = " + prixUnitaireProduit
				+ ", descriptionProduit = " + descriptionProduit + ", shortDescriptionProduit=" + shortDescriptionProduit + " ]";
	}

	public Integer getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrixUnitaireProduit() {
		return prixUnitaireProduit;
	}

	public void setPrixUnitaireProduit(double prixUnitaireProduit) {
		this.prixUnitaireProduit = prixUnitaireProduit;
	}

	public String getDescriptionProduit() {
		return descriptionProduit;
	}

	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}

	public String getShortDescriptionProduit() {
		return shortDescriptionProduit;
	}

	public void setShortDescriptionProduit(String shortDescriptionProduit) {
		this.shortDescriptionProduit = shortDescriptionProduit;
	}

}
