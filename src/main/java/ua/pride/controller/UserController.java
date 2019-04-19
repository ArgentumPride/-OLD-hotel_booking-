package ua.pride.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.pride.models.User;
import ua.pride.repositories.UserRepo;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    @GetMapping(value = {"/", "/home"})
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home.jsp");
        return modelAndView;
    }

    @GetMapping(value = "/addUser")
    public ModelAndView userPage() {
        ModelAndView modelAndView = new ModelAndView("addUser.jsp");
        modelAndView.addObject("headerMessage", "Add username");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping(value = "/addUser")
    public ModelAndView addUser(@ModelAttribute User user) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        userRepo.save(user);
        return modelAndView;
    }

}
