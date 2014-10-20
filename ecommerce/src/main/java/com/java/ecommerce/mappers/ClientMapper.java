package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Client;

public interface ClientMapper {

	public void insertClient(Client client);

	public Client getClientByLogin(String loginClient);

	public Client getClientById(Integer idClient);

	public Client getClientByMail(String mailClient);

	public List<Client> getAllClients();

	public void updateClient(Client client);

	public void deleteClient(Integer idClient);

	public boolean getClientByLoginPwd(String idClient, String pwdClient);

	public boolean getClientByEmail(String mailClient);

}
