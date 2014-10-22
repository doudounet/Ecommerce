package com.java.ecommerce.traitement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.java.ecommerce.model.Client;
import com.java.ecommerce.service.ClientService;

@Component
public class LoginValidator implements Validator {

	@Autowired
	private ClientService clientService;

	@Override
	public boolean supports(Class c) {
		return Identification.class.isAssignableFrom(c);
	}

	public void validate(Object obj, Errors errors) {
		Identification user = (Identification) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "utilisateur", "field.utilisateur.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.password.empty");
		// si champs login vide
		Client client = clientService.getClientByLogin(user.getUtilisateur());
		if (client != null) {
			if (!client.getPwdClient().equals(user.getPassword())) {
				errors.rejectValue("password", "field.password.NAN");
			}
		}

		else {

			errors.rejectValue("utilisateur", "field.utilisateur.NAN");
		}

		// si existant, on stocke l'emplacement de l'user dans la base
		// pour vérifier ensuite son mot de passe
		// else if
		// (client.getLoginClient().equals(identification.getUtilisateur())) {
		//
		// Client clientCheck1 = clients.get(compteur);
		// if
		// (!clientCheck1.getPwdClient().equals(identification.getPassword())) {
		// errors.rejectValue("password", "field.password.NAN");
		// }
		// }
		// compteur = compteur + 1;
		// }

	}
}
