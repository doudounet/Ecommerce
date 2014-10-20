package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.mappers.ClientMapper;
import com.java.ecommerce.model.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientMapper clientMapper;

	public ClientServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertClient(Client client) {
		clientMapper.insertClient(client);

	}

	@Override
	public Client getClientById(Integer idClient) {
		// TODO Auto-generated method stub
		return clientMapper.getClientById(idClient);
	}

	@Override
	public Client getClientByLogin(String loginClient) {
		// TODO Auto-generated method stub
		return clientMapper.getClientByLogin(loginClient);
	}

	@Override
	public boolean getClientByLoginPwd(String loginClient, String pwdClient) {
		// TODO Auto-generated method stub
		return clientMapper.getClientByLoginPwd(loginClient, pwdClient);
	}

	@Override
	public Client getClientByMail(String mailClient) {
		// TODO Auto-generated method stub
		return clientMapper.getClientByMail(mailClient);
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientMapper.getAllClients();
	}

	@Override
	public void updateClient(Client client) {
		clientMapper.updateClient(client);

	}

	@Override
	public void deleteClient(Integer idClient) {
		// TODO Auto-generated method stub
		clientMapper.deleteClient(idClient);
	}

}
