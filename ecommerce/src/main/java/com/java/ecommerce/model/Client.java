package com.java.ecommerce.model;

public class Client {

	private Integer idClient;
	private String prenomClient;
	private String nomClient;
	private String pwdClient;
	private String loginClient;
	private String mailClient;
	private String typeClient;
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", prenomClient="
				+ prenomClient + ", nomClient=" + nomClient + ", pwdClient="
				+ pwdClient + ", loginClient=" + loginClient + ", mailClient="
				+ mailClient + ", typeClient=" + typeClient + "]";
	}
	public Integer getIdClient() {
		return idClient;
	}
	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPwdClient() {
		return pwdClient;
	}
	public void setPwdClient(String pwdClient) {
		this.pwdClient = pwdClient;
	}
	public String getLoginClient() {
		return loginClient;
	}
	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}
	public String getMailClient() {
		return mailClient;
	}
	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}
	public String getTypeClient() {
		return typeClient;
	}
	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}


	
}