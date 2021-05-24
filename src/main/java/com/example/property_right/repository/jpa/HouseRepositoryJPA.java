package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.CarEntity;
import com.example.property_right.model.jpa.entity.HouseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseRepositoryJPA extends CrudRepository<HouseEntity, Long> {
    List<HouseEntity> getAllByUserId(Long userId);
}
