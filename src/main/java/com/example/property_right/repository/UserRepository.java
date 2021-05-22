package com.example.property_right.repository;

import com.example.property_right.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRepository extends InMemoryCrudRepository<User, Long> {


}
