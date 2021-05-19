package com.example.property_right.service;

import com.example.property_right.model.User;
import com.example.property_right.repository.base.CrudRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class ConfigService {



    private final UserService userService;

    public ConfigService(UserService userService) {
        this.userService = userService;
    }

}
