package com.example.property_right.repository.jdbc;

import com.example.property_right.model.House;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class HouseDAO extends GenericDaoImpl<House> {

    private static final String TABLE_NAME = "house";
    private static final String ID_COLUMN = "id";

    public HouseDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
        setTable(TABLE_NAME);
        setPrimaryKey(ID_COLUMN);
    }

    @Autowired
    private BaseObjectMapper<House> houseBaseObjectMapper;

    @Override
    protected BaseObjectMapper<House> getObjectMapper() {
        return houseBaseObjectMapper;
    }
}
