package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ecommerce.mappers.TypeMembreMapper;
import com.java.ecommerce.model.TypeMembre;

public class TypeMembreServiceImpl implements TypeMembreService{

	@Autowired
	private TypeMembreMapper typeMembreMapper;
	
	public TypeMembreServiceImpl() {
		super();
	}
	
	@Override
	public TypeMembre getTypeMembreById(Integer idTypeMembre)
	{
		return typeMembreMapper.getTypeMembreById(idTypeMembre);
	}

	@Override
	public List<TypeMembre> getAllTypeMembre()
	{
		return typeMembreMapper.getAllTypeMembre();
	}
	
	@Override
	public Integer getIdTypeMembre(TypeMembre typeMembre)
	{
		return getIdTypeMembre(typeMembre);
	}
}
