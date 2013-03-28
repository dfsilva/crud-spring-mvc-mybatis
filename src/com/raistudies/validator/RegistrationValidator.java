package com.raistudies.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.raistudies.domain.User;

@Component
public class RegistrationValidator implements Validator {


	public boolean supports(Class<?> c) {
		return User.class.isAssignableFrom(c);
	}

	
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "standard", "field.standard.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "field.age.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "field.sex.empty");
		User usrBean = (User)command;
		if(!isNumber(usrBean.getAge().trim()))
			errors.rejectValue("age", "field.age.NAN");
	}

	private boolean isNumber(String str){
	    for (int i = 0; i < str.length(); i++) {
	        
	        //If we find a non-digit character we return false.
	        if (!Character.isDigit(str.charAt(i)))
	        return false;
	        }
	         
	        return true;
	}
}
