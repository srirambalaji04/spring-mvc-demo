package com.springmvc.demo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.springmvc.demo.model.TeamInformation;

@Component
public class TeamInformationValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return TeamInformation.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		TeamInformation teamInformation = (TeamInformation) target;
		// Validate Resource Name
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "resourceName", "error.resourceName.required");

		// Validate whether "Experience" is selected
		if (teamInformation.getExperience() == 0) {
			errors.rejectValue("experience", "error.experience.required");
		}

	}
}
