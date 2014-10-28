package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Commande;

public interface CommandeService {

	public void insertCommande(Commande commande);

	public Commande getCommandeById(Integer id);

	public List<Commande> getAllCommandes();

	public void updateCommande(Commande commande);

	public void deleteCommande(Integer id);

	public int getHighCommandeId();
}
