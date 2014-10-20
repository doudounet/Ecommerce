package com.java.ecommerce.traitement;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.java.ecommerce.model.Client;

public class LoginValidator implements Validator {

	public boolean supports(Class<?> aClass) {
		return Client.class.equals(aClass);
	}

	@Override
	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "login", "required.login");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password");
	}

}
