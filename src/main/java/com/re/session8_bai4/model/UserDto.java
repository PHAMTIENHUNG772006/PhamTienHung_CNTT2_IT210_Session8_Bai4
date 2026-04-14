package com.re.session8_bai4.model;


import com.re.session8_bai4.custom_validator.PasswordMatches;

@PasswordMatches
public class UserDto {
   private  String username;
    private String password;
    private String confirmPassword;

    public UserDto () {
    }

    public UserDto(String username, String password, String confirmPassword) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
