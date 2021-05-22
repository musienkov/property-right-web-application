package com.example.property_right.service;

import com.example.property_right.model.User;
import com.example.property_right.repository.CrudRepository;
import com.example.property_right.repository.RepositoryWrappedCrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService extends RepositoryWrappedCrudService<User, Long> {

    private static Long USERS_COUNT = 0L;

    public UserService(CrudRepository<User, Long> repository) {
        super(repository);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void initData(){
        log.info("Creation init users");

        save(new CrudRepository.Pair<>(++USERS_COUNT, User.builder()
                .id(USERS_COUNT)
                .email("user1@mail.com")
                .name("Name1")
                .lastName("LastName1")
                .build()));
        save(new CrudRepository.Pair<>(++USERS_COUNT, User.builder()
                .id(USERS_COUNT)
                .email("user2@mail.com")
                .name("Name2")
                .lastName("LastName2")
                .build()));
        save(new CrudRepository.Pair<>(++USERS_COUNT, User.builder()
                .id(USERS_COUNT)
                .email("user3@mail.com")
                .name("Name3")
                .lastName("LastName3")
                .build()));
    }
}
