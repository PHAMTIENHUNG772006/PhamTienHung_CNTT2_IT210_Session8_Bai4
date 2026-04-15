package com.re.session8_bai4.custom_validator;

import com.re.session8_bai4.model.UserDto;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator
        implements ConstraintValidator<PasswordMatches, Object> {

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        if (obj == null) return false;

        UserDto dto = (UserDto) obj;
        String password = dto.getPassword();
        String confirmPassword = dto.getConfirmPassword();

        if (password == null || confirmPassword == null) {
            return false;
        }

        context.buildConstraintViolationWithTemplate("Mật khẩu không khớp")
                .addPropertyNode("confirmPassword")
                .addConstraintViolation();

        return password.equals(confirmPassword);
    }
}