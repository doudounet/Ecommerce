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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.model.Commande;
import com.java.ecommerce.service.ClientService;
import com.java.ecommerce.service.CommandeService;

@Controller
@SessionAttributes("idClient")
public class DetailProduitController {

	@Autowired
	private ClientService clientService;
	@Autowired
	private CommandeService commandeService;

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView VoirDetail(@RequestParam(value = "id", required = false) Integer id, final HttpSession session) {
		logger.info("ID " + id);
		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();
		ModelAndView mv = new ModelAndView("detailproduit");
		Commande commande = commandeService.getCommandeById(id);
		mv.addObject("commande", commande);
		mv.addObject("displayname", displayname);
		return mv;

	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView NewProduit(final HttpSession session) {
		logger.info("new commande" + commandeService.getHighCommandeId());
		int idClientLog = (Integer) session.getAttribute("idClient");
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();
		ModelAndView mv = new ModelAndView("detailproduit");
		int newId = (commandeService.getHighCommandeId() + 1);
		Commande commande = new Commande();
		commande.setId(newId);
		commande.setLibelle("A completer");
		commande.setDatedebut("A completer");
		commande.setDatedebut("A completer");
		commande.setPersonnemaj("A completer");
		commande.setType("A completer");
		commandeService.insertCommande(commande);
		logger.info(commande.getId());
		mv.addObject("commande", commande);
		mv.addObject("displayname", displayname);
		return mv;

	}

	@RequestMapping(value = "valider", method = RequestMethod.POST)
	public String Valider(@ModelAttribute(value = "commande") Commande commande, Model model) {
		logger.info("Delete " + commande);
		commandeService.updateCommande(commande);
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

