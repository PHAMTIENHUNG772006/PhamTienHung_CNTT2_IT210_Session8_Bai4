package com.re.session8_bai4.service;

import com.re.session8_bai4.model.UserDto;

public class UserServiceImpl implements UserService {
    @Override
    public boolean register(UserDto userDto) {

        String username = userDto.getUsername();
        String password = userDto.getPassword();
        String confirmPassword = userDto.getConfirmPassword();

        if (username == null || password == null || confirmPassword == null) {
            return false;
        }

        if (username.isBlank() || password.isBlank() || confirmPassword.isBlank()) {
            return false;
        }

        if (!password.equals(confirmPassword)) {
            return false;
        }

        return true;
    }
}
