package com.re.session8_bai4.controller;

import com.re.session8_bai4.model.UserDto;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @PostMapping("/hr/add-employee")
    public String saveEmployee(@Valid @ModelAttribute UserDto employeeDto,
                               BindingResult result,
                               Model model

    ) {

        if (result.hasErrors()) {

            model.addAttribute("employee", employeeDto);
            return "employee-form";
        }

        return "redirect:/success";
    }
}
