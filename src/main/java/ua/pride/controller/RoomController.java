package ua.pride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.pride.models.Category;
import ua.pride.models.Room;
import ua.pride.repositories.RoomRepo;
import ua.pride.repositories.UserRepo;

import java.util.List;

@RestController
public class RoomController {
    @Autowired
    RoomRepo roomRepo;

    @Autowired
    UserRepo userRepo;

    private List<Room> roomList;

    @GetMapping("/getRooms")
    public ModelAndView getRooms(){
        roomList = roomRepo.findAll();
        ModelAndView modelAndView = new ModelAndView("rooms.jsp");
        modelAndView.addObject("DBRooms", roomList);
        return modelAndView;
    }

    @GetMapping("/byCategory")
    public ModelAndView findAll(@RequestParam Category category){
        roomList = roomRepo.findAllByCategory(category);
        ModelAndView modelAndView = new ModelAndView("rooms.jsp");
        modelAndView.addObject("DBRooms", roomList);
        return modelAndView;
    }
}

