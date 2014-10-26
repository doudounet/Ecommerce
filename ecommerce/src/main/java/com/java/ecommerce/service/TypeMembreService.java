package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.TypeMembre;

public interface TypeMembreService {
	public TypeMembre getTypeMembreById(Integer idTypeMembre);
	public List<TypeMembre> getAllTypeMembre();
	public Integer getIdTypeMembre(TypeMembre typeMembre);
}
