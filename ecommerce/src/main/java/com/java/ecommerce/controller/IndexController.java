package com.java.ecommerce.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.service.ClientService;
import com.java.ecommerce.traitement.Identification;
import com.java.ecommerce.traitement.LoginValidator;

@Controller
@SessionAttributes("idClient")
public class IndexController {

	protected final Log logger = LogFactory.getLog(getClass());
	private LoginValidator validator = null;
	@Autowired
	private ClientService clientService;

	public LoginValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(LoginValidator validator) {
		this.validator = validator;
	}

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
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("identification", new Identification());
		logger.info("Returning index view");

		// bussiness logic

		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView identificationSubmit(@ModelAttribute("identification") Identification identification, BindingResult result) {
		validator.validate(identification, result);

		logger.info("STEP 1 " + identification.getUtilisateur() + " " + identification.getPassword());

		if (!result.hasErrors()) {
			Client client = clientService.getClientByLogin(identification.getUtilisateur());
			ModelAndView mv = new ModelAndView("redirect:/rechercheproduit");
			mv.addObject("idClient", client.getIdClient());
			logger.info("STEP 2 " + client.getIdClient() + "  " + identification.getPassword());
			return mv;

		}

		// if (found) {
		// logger.info("Go recherche produit view " +
		// identification.getUtilisateur() + " " + found);
		// return "redirect:/rechercheproduit";
		// } else {S
		// logger.info("Acces non accordé");
		// return "index";
		// }
		else {
			logger.info("STEP 3");
			return new ModelAndView("index");
		}
	}

	@RequestMapping(value = "/index")
	public ModelAndView logout(final HttpServletResponse response) throws IOException {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("identification", new Identification());
		logger.info("Returning index view");

		// bussiness logic

		return mav;
	}

}