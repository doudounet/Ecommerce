package com.java.ecommerce.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("idClient")
public class UtilisateursController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/panier")
	public ModelAndView LoadPanier(final HttpServletResponse response) throws IOException {

		logger.info("Returning panier");

		// bussiness logic

		return new ModelAndView("panier");
	}

	// @RequestMapping(value = "/logout", method = RequestMethod.POST)
	// public String Logout() {
	// return "index";
	// }
}