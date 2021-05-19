package com.example.property_right.repository;

import com.example.property_right.model.User;
import com.example.property_right.repository.base.CrudRepository;
import com.example.property_right.repository.base.InMemoryCrudRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class UserRepository extends InMemoryCrudRepository<User, Long> {


}
