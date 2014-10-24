package com.java.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.service.ClientService;

@Controller
@SessionAttributes("idClient")
public class UtilisateursController {

	@Autowired
	private ClientService clientService;

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/utilisateurs")
	public ModelAndView LoadListUtilisateur(final HttpSession session) {

		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();

		logger.info("Returning list user");
		List<Client> clients = clientService.getAllClients();
		ModelAndView mav = new ModelAndView("utilisateurs");
		mav.addObject("clients", clients);
		mav.addObject("displayname", displayname);
		return mav;
	}

	@RequestMapping(value = "/deleteuser", method = RequestMethod.GET)
	public String VoirDetail(@RequestParam(value = "id") Integer idClient, final HttpSession session) {
		logger.info("Delete " + idClient);
		clientService.deleteClient(idClient);
		return "redirect:/utilisateurs";

	}
}