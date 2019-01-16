package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @RequestMapping
    public ModelAndView getAll(ModelAndView modelAndView){
        modelAndView.setViewName("allClients");
        modelAndView.addObject("clients", clientRepo.findAll());
        return modelAndView;
    }
}
