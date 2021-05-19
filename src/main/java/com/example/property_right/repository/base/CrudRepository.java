package com.example.property_right.repository.base;

import lombok.Value;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface CrudRepository<Type, Id> {
    List<Type> findAll();

    Optional<Type> findById(Id id);

    void save(Pair<Type, Id> forCreate);

    void saveAll(Collection<Pair<Type, Id>> forCreate);

    void addIfNotPresent(Collection<Pair<Type, Id>> toAdd);

    void remove(Id id);

    int count();

    boolean existsById(Id id);

    @Value
    class Pair<Type, Id> {
        Id id;
        Type value;
    }
}
