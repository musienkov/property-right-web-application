package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends CrudRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}
