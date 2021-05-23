package com.example.property_right.model.jpa.dto;

import com.example.property_right.model.jpa.entity.CarEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarDto {

    private Long id;
    private String mark;
    private String model;
    private int price;

    public static CarDto from(CarEntity carEntity) {
        return CarDto.builder()
                .id(carEntity.getId())
                .mark(carEntity.getMark())
                .model(carEntity.getModel())
                .price(carEntity.getPrice())
                .build();
    }
}
