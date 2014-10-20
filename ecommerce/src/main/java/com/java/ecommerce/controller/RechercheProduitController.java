package com.java.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.model.Produit;
import com.java.ecommerce.service.ClientService;
import com.java.ecommerce.service.ProduitService;

@Controller
@SessionAttributes({ "idClient", "idProduit" })
public class RechercheProduitController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private ProduitService produitService;

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/rechercheproduit")
	public String LoadRechercheProduit(final Model model, HttpSession session) {

		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();

		logger.info("Returning recherche produit view");
		List<Produit> produits = produitService.getAllProduits();
		model.addAttribute("produits", produits);
		model.addAttribute("displayname", displayname);
		return "rechercheproduit";
	}

	@RequestMapping(value = "/detail/{idProduitSelect}", params = "glyphicon glyphicon-search", method = RequestMethod.GET)
	public String VoirDetail(@PathVariable("idProduitSelect") int idP, Model model) {

		model.addAttribute("idProduit", idP);

		logger.info("Test Detail" + idP);
		return "redirect:/detailproduit";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String Logout() {
		return "index";
	}

}
