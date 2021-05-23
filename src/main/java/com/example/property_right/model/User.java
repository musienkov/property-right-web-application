package com.example.property_right.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private Long id;
    private String email;
    @JsonIgnore
    private String password;
    private String name;
    private String lastName;
    private String patronymic;
    private List<Car> cars;
    private List<House> houses;
}
