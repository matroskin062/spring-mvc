package com.mvc.spring.springmvclab.Repositories;

import com.mvc.spring.springmvclab.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long>{
    User findByUsername(String username);
}
