package com.salesianostriana.dam.registrologin.validation.validator;

import com.salesianostriana.dam.registrologin.user.service.UserService;
import com.salesianostriana.dam.registrologin.validation.anotation.UniqueUsername;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

    @Autowired
    private UserService userService;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(s) && !userService.existByUsername(s);
    }
}