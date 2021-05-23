package com.example.property_right.model.mapper;

import com.example.property_right.model.House;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class HouseMapper implements BaseObjectMapper<House> {

    public static final String SELECT_SQL =
            "SELECT * FROM house";

    @Override
    public Map<String, Object> mapObject(House obj) {
        Map<String, Object> res = new HashMap<>();
        res.put("id", obj.getId());
        res.put("square", obj.getSquare());
        res.put("address", obj.getAddress());
        return res;
    }

    @Override
    public String getSelectSql() {
        return SELECT_SQL;
    }

    @Override
    public House mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Double square = resultSet.getDouble("square");
        String address = resultSet.getString("address");
        return House.builder()
                .id(id)
                .square(square)
                .address(address)
                .build();
    }
}
