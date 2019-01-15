package com.mvc.spring.springmvclab.Repositories;

import com.mvc.spring.springmvclab.Entities.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepo extends CrudRepository<Bank, Long> {
}
