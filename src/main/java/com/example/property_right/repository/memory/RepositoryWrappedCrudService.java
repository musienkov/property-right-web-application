package com.example.property_right.repository.memory;

import com.example.property_right.exception.ObjectNotFoundException;
import com.example.property_right.service.memory.CrudService;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class RepositoryWrappedCrudService<Type, Id> implements CrudService<Type, Id> {
    private final CrudRepository<Type, Id> repository;

    @Override
    public List<Type> findAll() {
        return repository.findAll();
    }

    @Override
    public Type findById(Id id) throws ObjectNotFoundException {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException(
                        String.format("Object with id %s is not found", id.toString())
                )
        );
    }

    @Override
    public void save(CrudRepository.Pair<Type, Id> forCreate) {
        repository.save(forCreate);
    }

    @Override
    public void saveAll(Collection<CrudRepository.Pair<Type, Id>> forCreate) {
        repository.saveAll(forCreate);
    }

    @Override
    public void addIfNotPresent(Collection<CrudRepository.Pair<Type, Id>> toAdd) {
        repository.addIfNotPresent(toAdd);
    }

    @Override
    public void remove(Id id) {
        repository.remove(id);
    }

    @Override
    public int count() {
        return repository.count();
    }

    @Override
    public boolean existsById(Id id) {
        return repository.existsById(id);
    }
}

