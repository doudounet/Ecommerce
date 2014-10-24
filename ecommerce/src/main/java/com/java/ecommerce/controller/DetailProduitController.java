package com.java.ecommerce.controller;

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

	// @ModelAttribute
	// public Produit newProduct(
	// @RequestParam(value = "id", required = false) Integer productNumber) {
	// if (productNumber != null) {
	// logger.info("find product " + productNumber);
	// return manager.find(productNumber);
	// }
	// Product p = new Product();
	// p.setNumber(null);
	// p.setName("");
	// p.setPrice(0.0);
	// p.setDescription("");
	// logger.info("new product = " + p);
	// return p;
	// }

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView VoirDetail(@RequestParam(value = "id") Integer idProduit, final HttpSession session) {
		logger.info("ID " + idProduit);
		int idClientLog = (Integer) session.getAttribute("idClient");
		Produit produit = produitService.getProduitById(idProduit);
		Client client = clientService.getClientById(idClientLog);
		String displayname = client.getPrenomClient() + " " + client.getNomClient();
		ModelAndView mv = new ModelAndView("detailproduit");
		// mv.addObject("produit", produit);
		mv.addObject("nomProduit", produit.getNomProduit());
		mv.addObject("prixUnitaireProduit", produit.getPrixUnitaireProduit());
		mv.addObject("descriptionProduit", produit.getDescriptionProduit());
		mv.addObject("displayname", displayname);

		logger.info("ID");
		return mv;
	}
}
// @RequestMapping(value = "/detail/", method = RequestMethod.GET)
// public String VoirDetail(@RequestParam(value = "id", required = false),
// ModelMap map) {
// map.put("id", id);
// logger.info("Produit id = " + id);
// return "detailproduit";
// }

