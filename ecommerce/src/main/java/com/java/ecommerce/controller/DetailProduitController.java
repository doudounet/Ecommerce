package com.java.ecommerce.controller;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.model.Produit;
import com.java.ecommerce.service.ClientService;
import com.java.ecommerce.service.ProduitService;

@Controller
@SessionAttributes("idClient")
public class DetailProduitController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private ProduitService produitService;

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView VoirDetail(@RequestParam(value = "id", required = false) Integer idProduit, final HttpSession session) {
		logger.info("ID " + idProduit);
		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();
		ModelAndView mv = new ModelAndView("detailproduit");
		Produit produit = produitService.getProduitById(idProduit);
		mv.addObject("produit", produit);
		mv.addObject("displayname", displayname);
		return mv;

	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView NewProduit(final HttpSession session) {
		logger.info("new produit" + produitService.getHighProduitId());
		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();
		ModelAndView mv = new ModelAndView("detailproduit");
		int newId = (produitService.getHighProduitId() + 1);
		Produit produit = new Produit();
		produit.setIdProduit(newId);
		produit.setNomProduit("A completer");
		produit.setPrixUnitaireProduit(0);
		produit.setShortDescriptionProduit("A completer");
		produit.setDescriptionProduit("A completer");
		produitService.insertProduit(produit);
		logger.info(produit.getIdProduit());
		mv.addObject("produit", produit);
		mv.addObject("displayname", displayname);
		return mv;

	}

	@RequestMapping(value = "valider", method = RequestMethod.POST)
	public String Valider(@ModelAttribute(value = "produit") Produit produit, Model model) {
		logger.info("Delete " + produit);
		produitService.updateProduit(produit);
		return "redirect:/rechercheproduit";

	}

	// mv.addObject("nomProduit", produit.getNomProduit());
	// mv.addObject("prixUnitaireProduit",
	// produit.getPrixUnitaireProduit());
	// mv.addObject("idProduit", produit.getIdProduit());
	// mv.addObject("descriptionProduit", produit.getDescriptionProduit());
	// mv.addObject("shortDescriptionProduit",
	// produit.getShortDescriptionProduit());

}

// @RequestMapping(value = "/detail/", method = RequestMethod.GET)
// public String VoirDetail(@RequestParam(value = "id", required = false),
// ModelMap map) {
// map.put("id", id);
// logger.info("Produit id = " + id);
// return "detailproduit";
// }

