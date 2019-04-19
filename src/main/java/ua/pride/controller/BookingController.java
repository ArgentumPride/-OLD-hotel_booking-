package ua.pride.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.pride.models.Booking;
import ua.pride.models.User;
import ua.pride.repositories.BookingRepo;
import ua.pride.repositories.UserRepo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class BookingController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    BookingRepo bookingRepo;

    private List<Booking> bookingList;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }

    @GetMapping("/getBooking")
    public ModelAndView getBooking() {
        bookingList = bookingRepo.findAll();
        ModelAndView modelAndView = new ModelAndView("getBookings.jsp");
        modelAndView.addObject("DBBooking", bookingList);
        return modelAndView;
    }

    @GetMapping(value = "/addBook")
    public ModelAndView bookingPage() {
        ModelAndView modelAndView = new ModelAndView("addBook.jsp");
        modelAndView.addObject("headerMessage", "Enter booking information");
        modelAndView.addObject("booking", new Booking());
        return modelAndView;
    }

    @PostMapping(value = "/addBook")
    public ModelAndView addBook(@ModelAttribute Booking booking) {
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
        bookingRepo.save(booking);
        return modelAndView;
    }
}
