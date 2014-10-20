package com.java.ecommerce.model;

public class Client {

	private Integer idClient;
	private String prenomClient;
	private String nomClient;
	private String pwdClient;
	private String loginClient;
	private String mailClient;

	public String toString() {
		return "Client [ prenomClient = " + prenomClient + ", loginClient = " + loginClient + ", idClient = " + idClient + ", prenomClient = " + prenomClient
				+ ", nomClient = " + nomClient + ", pwdClient = " + pwdClient + ", mailClient = " + mailClient + " ]";
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public void setLoginClient(String loginClient) {
		this.loginClient = loginClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public void setPwdClient(String pwdClient) {
		this.pwdClient = pwdClient;
	}

	public Integer getIdClient() {
		return idClient;
	}

	public String getLoginClient() {
		return loginClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public String getPwdClient() {
		return pwdClient;
	}

	public String getMailClient() {
		return mailClient;
	}

	public void setMailClient(String mailClient) {
		this.mailClient = mailClient;
	}

}