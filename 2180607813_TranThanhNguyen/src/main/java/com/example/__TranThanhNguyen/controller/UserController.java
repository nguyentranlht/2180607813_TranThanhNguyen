//package com.example.__TranThanhNguyen.controller;
//
//import com.example.__TranThanhNguyen.entity.User;
//import com.example.__TranThanhNguyen.services.UserService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import java.util.List;
//
//@Controller
//public class UserController {
//
//    private final UserService userService;
//    private final BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserController(UserService userService, BCryptPasswordEncoder passwordEncoder) {
//        this.userService = userService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @GetMapping("/login")
//    public String login() {
//        return "user/login";
//    }
//
//    @GetMapping("/register")
//    public String showRegistrationForm(Model model) {
//        model.addAttribute("user", new User());
//        return "user/register";
//    }
//
//    @PostMapping("/register")
//    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
//        if (bindingResult.hasErrors()) {
//            List<FieldError> errors = bindingResult.getFieldErrors();
//            for (FieldError error : errors) {
//                model.addAttribute(error.getField() + "_error", error.getDefaultMessage());
//            }
//            return "user/register";
//        }
//
//        // Encode the password
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        // Save the user
//        userService.save(user);
//
//        return "redirect:/login";
//    }
//}
