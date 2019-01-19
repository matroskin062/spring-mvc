package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Entities.Role;
import com.mvc.spring.springmvclab.Entities.User;
import com.mvc.spring.springmvclab.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@Controller
public class SecurityController {
    @Autowired
    private UserRepo userRepo;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public ModelAndView loginPage(Model modelAndView, String error){
        if(error != null)
            modelAndView.addAttribute("error", "Username or password invalid");
        return new ModelAndView("login");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/registration")
    public ModelAndView regPage(){
        return new ModelAndView("registration");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public ModelAndView registration(User user, Model model){
        User userFormDB = userRepo.findByUsername(user.getUsername());

        if(userFormDB != null){
            model.addAttribute("error", "User exists");
            return new ModelAndView("/registration");
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

        return new ModelAndView("redirect:/login");
    }
}
