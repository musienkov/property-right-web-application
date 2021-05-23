package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.CarEntity;
import com.example.property_right.model.jpa.entity.HouseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HouseRepositoryJPA extends CrudRepository<HouseEntity, Long> {
    List<HouseEntity> getAllByUserId(Long userId);
}
