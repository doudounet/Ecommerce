package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Produit;

public interface ProduitService {

	public void insertProduit(Produit produit);

	public Produit getProduitById(Integer idProduit);

	public List<Produit> getAllProduits();

	public void updateProduit(Produit produit);

	public void deleteProduit(Integer idProduit);

}
