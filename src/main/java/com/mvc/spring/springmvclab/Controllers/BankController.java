package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Entities.Bank;
import com.mvc.spring.springmvclab.Repositories.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
@RequestMapping("/bank")
public class BankController {

    @Autowired
    private BankRepo bankRepo;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView model){
        model.setViewName("allBanks");
        model.addObject("banks", bankRepo.findAll());
        return model;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public ModelAndView add(@ModelAttribute Bank bank){
        bankRepo.save(bank);
        return new ModelAndView("redirect:/bank");
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        bankRepo.deleteById(id);
        return new ModelAndView("redirect:/bank");
    }

}
