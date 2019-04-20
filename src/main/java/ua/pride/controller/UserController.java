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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    UserRepo userRepo;

    String username;

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
    public ModelAndView addUser(@ModelAttribute User user, HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        userRepo.save(user);
        HttpSession session = request.getSession();
        username = request.getParameter("username");
        session.setAttribute("username", username);
        return modelAndView;
    }

}
