package com.example.property_right.repository.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class InMemoryCrudRepository<Type, Id> implements CrudRepository<Type, Id> {
    private final Map<Id, Type> inMemoryStorage = new HashMap<>();

    @Override
    public List<Type> findAll() {
        return new ArrayList<>(inMemoryStorage.values());
    }

    @Override
    public Optional<Type> findById(Id id) {
        return Optional.ofNullable(inMemoryStorage.get(id));
    }

    @Override
    public void save(Pair<Type, Id> forCreate) {
        inMemoryStorage.put(forCreate.getId(), forCreate.getValue());
    }

    @Override
    public void saveAll(Collection<Pair<Type, Id>> forCreate) {
        Map<Id, Type> forCreateMap = forCreate.stream()
                .collect(
                        Collectors.toMap(Pair::getId,
                                Pair::getValue,
                                (a, b) -> b)
                );
        inMemoryStorage.putAll(forCreateMap);
    }

    @Override
    public void addIfNotPresent(Collection<Pair<Type, Id>> toAdd) {
        Set<Id> ids = inMemoryStorage.keySet();
        Collection<Pair<Type, Id>> newValues = toAdd
                .stream()
                .filter(pair -> !ids.contains(pair.getId()))
                .collect(Collectors.toList());
        saveAll(newValues);
    }

    @Override
    public void remove(Id id) {
        inMemoryStorage.remove(id);
    }

    @Override
    public int count() {
        return inMemoryStorage.size();
    }

    @Override
    public boolean existsById(Id id) {
        return inMemoryStorage.containsKey(id);
    }
}

