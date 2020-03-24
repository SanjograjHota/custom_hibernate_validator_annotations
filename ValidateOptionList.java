package com.srh.demo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OptionListValidator.class)
@Documented
public @interface ValidateOptionList {

	 String message() default "invalid option list";

	    Class<?>[] groups() default { };

	    Class<? extends Payload>[] payload() default { };

	    String[] values();
}