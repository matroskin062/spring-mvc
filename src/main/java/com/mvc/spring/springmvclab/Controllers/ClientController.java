package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Entities.Client;
import com.mvc.spring.springmvclab.Repositories.BankRepo;
import com.mvc.spring.springmvclab.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.concurrent.ThreadLocalRandom;

@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private BankRepo bankRepo;

    @RequestMapping
    public ModelAndView getAll(ModelAndView modelAndView){
        modelAndView.setViewName("allClients");
        modelAndView.addObject("clients", clientRepo.findAll());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ModelAndView create(@ModelAttribute Client client){
        client.setBank(bankRepo.findById(ThreadLocalRandom.current()
                .nextLong(1, (bankRepo.count() + 1))).get());

        clientRepo.save(client);
        return new ModelAndView("redirect:/client");
    }
}
