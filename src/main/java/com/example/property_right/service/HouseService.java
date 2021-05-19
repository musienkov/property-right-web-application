package com.example.property_right.service;

import com.example.property_right.model.Car;
import com.example.property_right.model.House;
import com.example.property_right.repository.base.CrudRepository;
import com.example.property_right.repository.base.RepositoryWrappedCrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HouseService extends RepositoryWrappedCrudService<House, Long> {
    public HouseService(CrudRepository<House, Long> repository) {
        super(repository);
    }

    private static Long HOUSES_COUNT = 0L;

    @EventListener(ApplicationReadyEvent.class)
    public void initData(){
        log.info("Creation init cars");

        save(new CrudRepository.Pair<>(++HOUSES_COUNT, House.builder()
                .id(HOUSES_COUNT)
                .square(100.5)
                .address("address 1")
                .build()));
        save(new CrudRepository.Pair<>(++HOUSES_COUNT, House.builder()
                .id(HOUSES_COUNT)
                .square(120.5)
                .address("address 2")
                .build()));
        save(new CrudRepository.Pair<>(++HOUSES_COUNT, House.builder()
                .id(HOUSES_COUNT)
                .square(130.5)
                .address("address 3")
                .build()));
    }
}
