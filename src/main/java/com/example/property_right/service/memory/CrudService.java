package com.example.property_right.service.memory;

import com.example.property_right.exception.ObjectNotFoundException;
import com.example.property_right.repository.memory.CrudRepository;
import lombok.Value;

import java.util.Collection;
import java.util.List;

public interface CrudService<Type, Id> {
    List<Type> findAll();

    Type findById(Id id) throws ObjectNotFoundException;

    void save(CrudRepository.Pair<Type, Id> forCreate);

    void saveAll(Collection<CrudRepository.Pair<Type, Id>> forCreate);

    void addIfNotPresent(Collection<CrudRepository.Pair<Type, Id>> forCreate);

    void remove(Id id);

    int count();

    boolean existsById(Id id);

    @Value
    class Pair<Type, Id> {
        Id id;
        Type value;
    }
}
