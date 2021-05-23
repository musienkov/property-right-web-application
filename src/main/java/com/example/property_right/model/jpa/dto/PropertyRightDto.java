package com.example.property_right.model.jpa.dto;

import com.example.property_right.model.jpa.entity.PropertyRightEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyRightDto {
    private Long id;
    private Long userId;
    private String documentType;
    private String description;
    private Long carId;
    private Long houseId;

    public static PropertyRightDto from(PropertyRightEntity entity) {
        return PropertyRightDto.builder()
                .id(entity.getId())
                .userId(entity.getUserId())
                .documentType(entity.getDocumentType())
                .description(entity.getDescription())
                .carId(entity.getCarId())
                .houseId(entity.getHouseId())
                .build();
    }
}
