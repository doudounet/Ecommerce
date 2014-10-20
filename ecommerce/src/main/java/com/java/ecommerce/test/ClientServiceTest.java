package com.java.ecommerce.test;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.service.ClientService;

public class ClientServiceTest {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private static ClientService clientService;

	@BeforeClass
	public static void setup() {

	}

	@AfterClass
	public static void teardown() {
		clientService = null;
	}

	@Test
	public void testGetClientById() {
		Client client = clientService.getClientById(3);
		Assert.assertNotNull(client);
		System.out.println("Voici le resultat de la recherche par ID :");
		System.out.println(client);
	}

	@Test
	public void testGetClientByLogin() {
		Client client = clientService.getClientByLogin("fdelbarre");
		Assert.assertNotNull(client);
		System.out.println("Voici le resultat de la recherche par login :");
		System.out.println(client);
	}

	@Test
	public void testGetClientByMail() {
		Client client = clientService.getClientByMail("fdelbarre@unis.fr");
		Assert.assertNotNull(client);
		System.out.println("Voici le resultat de la recherche par adresse mail :");
		System.out.println(client);
	}

	@Test
	public void testGetAllClients() {
		List<Client> clients = clientService.getAllClients();
		Assert.assertNotNull(clients);
		System.out.println("Voici la liste des clients : ");
		for (Client client : clients) {
			System.out.println(client);
		}

	}

	@Test
	public void testInsertClient() {
		Client client = new Client();
		client.setIdClient(10);
		client.setLoginClient("test");
		client.setPwdClient("secret");
		client.setPrenomClient("TestFirstName");
		client.setNomClient("TestLastName");
		client.setMailClient("test@test.fr");

		clientService.insertClient(client);

		Client createdClient = clientService.getClientById(client.getIdClient());
		Assert.assertNotNull(createdClient);
		Assert.assertEquals(client.getIdClient(), createdClient.getIdClient());
		Assert.assertEquals(client.getLoginClient(), createdClient.getLoginClient());
		Assert.assertEquals(client.getPwdClient(), createdClient.getPwdClient());
		Assert.assertEquals(client.getNomClient(), createdClient.getNomClient());
		Assert.assertEquals(client.getMailClient(), createdClient.getMailClient());
		System.out.println("Un client a été ajouté ( " + createdClient.getLoginClient() + " ) :");

	}

	@Test
	public void testUpdateClient() {
		long timestamp = System.currentTimeMillis();
		Client client = clientService.getClientById(3);
		client.setPrenomClient("TestFirstName" + timestamp);
		client.setNomClient("TestLastName" + timestamp);
		clientService.updateClient(client);
		Client updatedClient = clientService.getClientById(3);
		Assert.assertEquals(client.getPrenomClient(), updatedClient.getPrenomClient());
		Assert.assertEquals(client.getNomClient(), updatedClient.getNomClient());
		System.out.println("Un client a été mis à jour ( " + updatedClient.getLoginClient() + ") :");
	}

	@Test
	public void testDeleteClient() {
		Client client = clientService.getClientById(5);
		clientService.deleteClient(client.getIdClient());
		Client deletedClient = clientService.getClientById(5);
		Assert.assertNull(deletedClient);
		System.out.println("Un client a ete supprime");

	}
}