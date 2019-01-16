package com.mvc.spring.springmvclab.Repositories;

import com.mvc.spring.springmvclab.Entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<Client, Long> {
}
