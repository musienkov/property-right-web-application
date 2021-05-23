package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepositoryJPA extends CrudRepository<CarEntity, Long> {
    List<CarEntity> getAllByUserId(Long userId);
}
