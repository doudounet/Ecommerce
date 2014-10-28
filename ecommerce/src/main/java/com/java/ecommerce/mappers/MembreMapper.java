package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Membre;
import com.java.ecommerce.model.TypeMembre;

public interface MembreMapper {

	public void insertMembre(Membre membre);
	
	public void updateMembre(Membre membre);
	
	public void deleteMembre(Integer id);

	public List<Membre> getAllMembre();
	
	public Membre getMembreByLogin(String login);

	public Membre getMembreById(Integer id);

	//public Membre getMembreByLoginPwd(String login, String password);

	public List<Membre> getMembreByType(String type);
}
