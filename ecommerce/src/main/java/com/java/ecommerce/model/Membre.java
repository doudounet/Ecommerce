package com.java.ecommerce.model;

public class Membre {
	private Integer idMembre;
	private String prenomMembre;
	private String nomMembre;
	private String pwdMembre;
	private String loginMembre;
	private String typeMembre;
	
	@Override
	public String toString() {
		return "Membre [idMembre=" + idMembre + ", prenomMembre="
				+ prenomMembre + ", nomMembre=" + nomMembre + ", pwdMembre="
				+ pwdMembre + ", loginMembre=" + loginMembre + ", typeMembre="
				+ typeMembre + "]";
	}

	public Integer getIdMembre() {
		return idMembre;
	}

	public void setIdMembre(Integer idMembre) {
		this.idMembre = idMembre;
	}

	public String getPrenomMembre() {
		return prenomMembre;
	}

	public void setPrenomMembre(String prenomMembre) {
		this.prenomMembre = prenomMembre;
	}

	public String getNomMembre() {
		return nomMembre;
	}

	public void setNomMembre(String nomMembre) {
		this.nomMembre = nomMembre;
	}

	public String getPwdMembre() {
		return pwdMembre;
	}

	public void setPwdMembre(String pwdMembre) {
		this.pwdMembre = pwdMembre;
	}

	public String getLoginMembre() {
		return loginMembre;
	}

	public void setLoginMembre(String loginMembre) {
		this.loginMembre = loginMembre;
	}

	public String getTypeMembre() {
		return typeMembre;
	}

	public void setTypeMembre(String typeMembre) {
		this.typeMembre = typeMembre;
	}
}
	
	