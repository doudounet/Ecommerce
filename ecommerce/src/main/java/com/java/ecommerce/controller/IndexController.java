package com.java.ecommerce.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.service.ClientService;
import com.java.ecommerce.traitement.Identification;

@Controller
@SessionAttributes("idClient")
public class IndexController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ClientService clientService;

	//
	// //
	// @RequestMapping(value = "/")
	// public ModelAndView test(final HttpServletResponse response final )
	// throws
	// IOException {
	//
	// logger.info("Returning home view");
	//
	// // bussiness logic
	//
	// final String now = (new Date()).toString();
	// logger.info("Returning index view with " + now);
	//
	// return new ModelAndView("index", "now", now);
	// }
	// }
	@RequestMapping(value = "/")
	public ModelAndView test(final HttpServletResponse response) throws IOException {

		logger.info("Returning index view");

		// bussiness logic

		return new ModelAndView("index");
	}

	@RequestMapping(value = "/login", params = "btn btn-success", method = RequestMethod.GET)
	public String identificationSubmit(@ModelAttribute final Identification identification, final Model model) {

		Client client = clientService.getClientByLogin(identification.getUtilisateur());
		model.addAttribute("idClient", client.getIdClient());

		// if (found) {
		// logger.info("Go recherche produit view " +
		// identification.getUtilisateur() + " " + found);
		// return "redirect:/rechercheproduit";
		// } else {
		// logger.info("Acces non accordé");
		// return "index";
		// }

		return "redirect:/rechercheproduit";
	}
}