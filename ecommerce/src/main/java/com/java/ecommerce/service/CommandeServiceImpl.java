package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.mappers.CommandeMapper;
import com.java.ecommerce.model.Commande;

@Service
public class CommandeServiceImpl implements CommandeService {

	@Autowired
	private CommandeMapper commandeMapper;

	public CommandeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertCommande(Commande commande) {
		commandeMapper.insertCommande(commande);

	}

	@Override
	public Commande getCommandeById(Integer id) {
		// TODO Auto-generated method stub
		return commandeMapper.getCommandeById(id);
	}

	

	@Override
	public List<Commande> getAllCommandes() {
		// TODO Auto-generated method stub
		return commandeMapper.getAllCommandes();
	}

	@Override
	public void updateCommande(Commande commande) {
		commandeMapper.updateCommande(commande);

	}

	@Override
	public void deleteCommande(Integer id) {
		// TODO Auto-generated method stub
		commandeMapper.deleteCommande(id);
	}

	@Override
	public int getHighCommandeId() {
		// TODO Auto-generated method stub
		return commandeMapper.getHighCommandeId();
	}

}
