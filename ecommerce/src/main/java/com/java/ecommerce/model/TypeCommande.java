package com.java.ecommerce.model;

public class TypeCommande {
	private Integer id;
	private String type;
	
	@Override
	public String toString()
	{
		return "TypeCommande [id=" + id + ", type=" + type + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getId() {
		return id;
	}
	
}
