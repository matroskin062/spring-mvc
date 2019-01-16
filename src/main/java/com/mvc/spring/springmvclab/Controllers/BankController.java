package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Entities.Bank;
import com.mvc.spring.springmvclab.Repositories.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankRepo bankRepo;

    public BankController(BankRepo bankRepo){
        this.bankRepo = bankRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView model){
        model.setViewName("allBanks");
        model.addObject("banks", bankRepo.findAll());
        return model;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ModelAndView getById(ModelAndView modelAndView, @PathVariable Long id){
        modelAndView.setViewName("bankInfo");
        modelAndView.addObject("bank", bankRepo.findById(id).get());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ModelAndView create(@ModelAttribute Bank bank){
        bankRepo.save(bank);
        return new ModelAndView("redirect:/bank");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        bankRepo.deleteById(id);
        return new ModelAndView("redirect:/bank");
    }

}
