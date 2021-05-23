package com.example.property_right.model.mapper;

import com.example.property_right.model.Car;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class CarMapper implements BaseObjectMapper<Car> {

    public static final String SELECT_SQL =
            "SELECT * FROM car";

    @Override
    public Map<String, Object> mapObject(Car obj) {
        Map<String, Object> res = new HashMap<>();
        res.put("id", obj.getId());
        res.put("mark", obj.getMark());
        res.put("model", obj.getModel());
        res.put("price", obj.getPrice());
        return res;
    }

    @Override
    public String getSelectSql() {
        return SELECT_SQL;
    }

    @Override
    public Car mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String mark = resultSet.getString("mark");
        String model = resultSet.getString("model");
        int price = resultSet.getInt("price");
        return Car.builder()
                .id(id)
                .mark(mark)
                .model(model)
                .price(price)
                .build();
    }
}
