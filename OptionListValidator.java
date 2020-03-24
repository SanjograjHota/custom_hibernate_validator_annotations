package com.srh.demo;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OptionListValidator implements ConstraintValidator<ValidateOptionList, List<String>> {
	private String[] optionList;

	@Override
	public void initialize(ValidateOptionList option) {
		this.optionList = option.values();
	}

	@Override
	public boolean isValid(List<String> checkList, ConstraintValidatorContext cvc) {
		// TODO Auto-generated method stub

		if (checkList == null) {
			return true;
		}

		if (java.util.Arrays.asList(optionList).containsAll(checkList)) {
			return true;
		}

		return false;
	}

}
