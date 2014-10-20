package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Produit;

public interface ProduitMapper {
	public void insertProduit(Produit produit);

	public Produit getProduitById(Integer idProduit);

	public List<Produit> getAllProduits();

	public void updateProduit(Produit produit);

	public void deleteProduit(Integer idProduit);

}
