package com.re.session8_bai4.custom_validator;

import com.re.session8_bai4.model.UserDto;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = com.re.session8_bai4.custom_validator.PasswordMatchesValidator.class)
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatches {
    String message() default "Password và ConfirmPassword không khớp";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}