package com.re.session8_bai4.controller;

import com.re.session8_bai4.model.UserDto;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    @GetMapping("/login")
    public String showForm(Model model) {

        model.addAttribute("employee", new UserDto());
        return "employee-form";
    }

    @PostMapping("/hr/add-employee")
    public String saveEmployee(@Valid @ModelAttribute("employee") UserDto employeeDto,
                               BindingResult result,
                               Model model) {

        if (result.hasErrors()) {

            return "employee-form";
        }

        return "redirect:/success";
    }
}
