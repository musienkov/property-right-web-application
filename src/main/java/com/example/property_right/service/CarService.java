package com.example.property_right.service;

import com.example.property_right.model.Car;
import com.example.property_right.model.User;
import com.example.property_right.repository.base.CrudRepository;
import com.example.property_right.repository.base.RepositoryWrappedCrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CarService extends RepositoryWrappedCrudService<Car, Long> {
    public CarService(CrudRepository<Car, Long> repository) {
        super(repository);
    }

    private static Long CARS_COUNT = 0L;

    @EventListener(ApplicationReadyEvent.class)
    public void initData(){
        log.info("Creation init cars");

        save(new CrudRepository.Pair<>(++CARS_COUNT, Car.builder()
                .id(CARS_COUNT)
                .mark("mark 1")
                .model("model 1")
                .price(1000)
                .build()));
        save(new CrudRepository.Pair<>(++CARS_COUNT, Car.builder()
                .id(CARS_COUNT)
                .mark("mark 2")
                .model("model 2")
                .price(1000)
                .build()));
        save(new CrudRepository.Pair<>(++CARS_COUNT, Car.builder()
                .id(CARS_COUNT)
                .mark("mark 3")
                .model("model 3")
                .price(1000)
                .build()));
    }
}
