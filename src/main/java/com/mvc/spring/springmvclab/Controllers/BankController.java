package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Repositories.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        bankRepo.deleteById(id);
        return new ModelAndView("redirect:/bank");
    }

}
