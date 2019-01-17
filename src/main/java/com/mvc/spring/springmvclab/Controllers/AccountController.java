package com.mvc.spring.springmvclab.Controllers;

import com.mvc.spring.springmvclab.Entities.BankAccount;
import com.mvc.spring.springmvclab.Repositories.AccountRepo;
import com.mvc.spring.springmvclab.Repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountRepo accountRepo;

    @Autowired
    private ClientRepo clientRepo;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView getAll(ModelAndView modelAndView){
        modelAndView.setViewName("allAccounts");
        modelAndView.addObject("accounts", accountRepo.findAll());
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        accountRepo.deleteById(id);
        return new ModelAndView("redirect:/account");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/create")
    public ModelAndView create(@ModelAttribute BankAccount account){
        accountRepo.save(account);
        return new ModelAndView("redirect:/account");
    }
}
