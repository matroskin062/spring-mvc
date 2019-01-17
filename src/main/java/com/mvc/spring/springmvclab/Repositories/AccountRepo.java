package com.mvc.spring.springmvclab.Repositories;

import com.mvc.spring.springmvclab.Entities.BankAccount;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<BankAccount, Long> {
}
