package com.example.property_right.model.jpa.dto;

import com.example.property_right.model.jpa.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String patronymic;
    private List<CarDto> cars;
    private List<HouseDto> houses;

    public static UserDto from(UserEntity entity) {
        return UserDto.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .password(entity.getPassword())
                .name(entity.getName())
                .lastName(entity.getLastName())
                .patronymic(entity.getPatronymic())
                .cars(entity.getCars().stream().map(CarDto::from).collect(Collectors.toList()))
                .houses(entity.getHouses().stream().map(HouseDto::from).collect(Collectors.toList()))
                .build();
    }
}
