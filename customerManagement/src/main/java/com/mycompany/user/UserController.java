package com.mycompany.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired private UserService service;

    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers= service.listAll();
        model.addAttribute("ListUsers",listUsers);
        return "users";
    }
    @GetMapping("/users/new")
    public String showNewForm(Model model){
        model.addAttribute("user",new User());
        return "user_form";
     }
     @PostMapping("/users/save")
    public String saveUser(User user){
        service.save(user);
         return null;
     }
     @RequestMapping("/userLogin")
    public String userToLogin()
     {
         return "login";
     }
     @RequestMapping("/to_form")
    public String gotoform()
     {
         return "form";
     }
     @RequestMapping("/to_expense")
    public String gotoexpense()
     {
         return "expense";
     }
     @RequestMapping("/to_cat")
    public String gotocat()
     {
         return "cat";
     }

}
