package com.java.ecommerce.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes({ "idClient", "idProduit" })
public class DetailProduitController {

	protected final Log logger = LogFactory.getLog(getClass());

	@RequestMapping(value = "/detailproduit")
	public ModelAndView LoadDetailProduit(final HttpServletResponse response, HttpSession session) throws IOException {
		int idProduitLog = (Integer) session.getAttribute("idProduit");
		logger.info("Returning detail" + idProduitLog);

		// bussiness logic

		return new ModelAndView("detailproduit");
	}
}
