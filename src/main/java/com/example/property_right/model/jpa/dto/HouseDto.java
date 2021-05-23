package com.example.property_right.model.jpa.dto;

import com.example.property_right.model.jpa.entity.HouseEntity;
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
public class HouseDto {

    private Long id;
    private Double square;
    private String address;

    public static HouseDto from(HouseEntity entity) {
        return HouseDto.builder()
                .id(entity.getId())
                .address(entity.getAddress())
                .square(entity.getSquare())
                .build();
    }
}
