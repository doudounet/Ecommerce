package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Commande;

public interface CommandeMapper {

	public void insertCommande(Commande commande);

	public Commande getCommandeById(Integer idCommande);

	public List<Commande> getAllCommandes();

	public void updateCommande(Commande commande);

	public void deleteCommande(Integer idCommande);
	
	public int getHighCommandeId();


}
