package com.srh.demo;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = OptionValidator.class)
@Documented
public @interface ValidateOption {
	
	 String message() default "invalid option";

	    Class<?>[] groups() default { };

	    Class<? extends Payload>[] payload() default { };

	    String[] values();


}
