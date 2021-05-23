package com.example.property_right.repository.jdbc;

import com.example.property_right.model.Car;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CarDAO extends GenericDaoImpl<Car> {

    private static final String TABLE_NAME = "car";
    private static final String ID_COLUMN = "id";

    public CarDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
        setTable(TABLE_NAME);
        setPrimaryKey(ID_COLUMN);
    }

    @Autowired
    private BaseObjectMapper<Car> carBaseObjectMapper;

    @Override
    protected BaseObjectMapper<Car> getObjectMapper() {
        return carBaseObjectMapper;
    }
}
