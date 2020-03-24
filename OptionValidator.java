package com.srh.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OptionValidator implements ConstraintValidator<ValidateOption, String> {
	private String[] optionList;

	@Override
	public void initialize(ValidateOption option) {
		this.optionList = option.values();
	}

	@Override
	public boolean isValid(String checkString, ConstraintValidatorContext cvc) {
		// TODO Auto-generated method stub

		if (checkString == null) {
			return true;
		}
		if (java.util.Arrays.asList(optionList).contains(checkString)) {
			return true;
		}

		return false;
	}

}
