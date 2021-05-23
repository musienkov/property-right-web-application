package com.example.property_right.model.mapper;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class PropertyRightMapper implements BaseObjectMapper<PropertyRight> {

    public static final String SELECT_SQL =
            "SELECT * FROM property_right";

    @Override
    public Map<String, Object> mapObject(PropertyRight obj) {
        Map<String, Object> res = new HashMap<>();
        res.put("id", obj.getId());
        res.put("carId", obj.getCarId());
        res.put("description", obj.getDescription());
        res.put("documentType", obj.getDocumentType());
        res.put("houseId", obj.getHouseId());
        res.put("userId", obj.getUserId());
        return res;
    }

    @Override
    public String getSelectSql() {
        return SELECT_SQL;
    }

    @Override
    public PropertyRight mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long carId = resultSet.getLong("carId");
        Long houseId = resultSet.getLong("houseId");
        Long userId = resultSet.getLong("userId");
        String description = resultSet.getString("description");
        String documentType = resultSet.getString("documentType");
        return PropertyRight.builder()
                .id(id)
                .carId(carId)
                .description(description)
                .documentType(documentType)
                .houseId(houseId)
                .userId(userId)
                .build();
    }
}
