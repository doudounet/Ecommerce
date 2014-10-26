package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.TypeCommande;

public interface TypeCommandeMapper {
	
	public TypeCommande getTypeCommandeById(Integer idTypeCommande);
	
	public List<TypeCommande> getAllTypeCommande();
	
	public Integer getIdTypeCommande(TypeCommande typeCommande);
	
}

