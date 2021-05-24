package com.example.property_right.repository.jpa;

import com.example.property_right.model.jpa.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepositoryJPA extends CrudRepository<CarEntity, Long> {
    List<CarEntity> getAllByUserId(Long userId);
}
