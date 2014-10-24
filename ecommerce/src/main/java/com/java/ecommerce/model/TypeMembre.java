package com.java.ecommerce.model;

public class TypeMembre {
	private Integer idTypeMembre;
	private String type;
	
	@Override
	public String toString() {
		return "TypeMembre [idTypeMembre=" + idTypeMembre + ", type=" + type
				+ "]";
	}
	public Integer getIdTypeMembre() {
		return idTypeMembre;
	}
	public void setIdTypeMembre(Integer idTypeMembre) {
		this.idTypeMembre = idTypeMembre;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
		
}
