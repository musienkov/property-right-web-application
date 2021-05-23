package com.example.property_right.model.mapper.generic;

import org.springframework.jdbc.core.RowMapper;

import java.util.Map;

public interface BaseObjectMapper<T> extends RowMapper<T> {
    Map<String, Object> mapObject(T obj);
    String getSelectSql();
}
