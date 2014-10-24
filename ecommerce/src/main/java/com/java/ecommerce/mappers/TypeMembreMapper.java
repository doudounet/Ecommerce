package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.TypeMembre;

public interface TypeMembreMapper {
	
	public TypeMembre getTypeMembreById(Integer idTypeMembre);
	
	public List<TypeMembre> getAllTypeMembre();
	
	public Integer getIdTypeMembre(TypeMembre typeMembre);
	
}
