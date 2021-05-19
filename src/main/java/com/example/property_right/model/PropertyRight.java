package com.example.property_right.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyRight {

    private Long id;
    private Long userId;
    private String documentType;
    private String description;
    private Long carId;
    private Long houseId;

}
