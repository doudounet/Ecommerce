package com.java.ecommerce.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/detail/{idProduit}/aa", method = RequestMethod.GET)
	public ModelAndView VoirDetail(@PathVariable("idProduit") Integer idProduit) {
		ModelAndView mv = new ModelAndView("detailproduit");
		Produit produit = produitService.getProduitById(idProduit);
		mv.addObject("Produit", produit);
		logger.info("Test Detail" + idProduit);
		return mv;
	}
}
