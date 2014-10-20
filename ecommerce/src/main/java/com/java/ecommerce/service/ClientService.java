package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Client;

public interface ClientService {

	public void insertClient(Client client);

	public Client getClientById(Integer idClient);

	public Client getClientByLogin(String loginClient);

	public boolean getClientByLoginPwd(String loginClient, String pwdClient);

	public Client getClientByMail(String mailClient);

	public List<Client> getAllClients();

	public void updateClient(Client client);

	public void deleteClient(Integer idClient);

}
