package com.example.property_right.repository.jdbc;

import com.example.property_right.model.PropertyRight;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class PropertyRightDAO extends GenericDaoImpl<PropertyRight> {

    private static final String TABLE_NAME = "property_right";
    private static final String ID_COLUMN = "id";

    public PropertyRightDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
        setTable(TABLE_NAME);
        setPrimaryKey(ID_COLUMN);
    }

    @Autowired
    private BaseObjectMapper<PropertyRight> propertyRightBaseObjectMapper;

    @Override
    protected BaseObjectMapper<PropertyRight> getObjectMapper() {
        return propertyRightBaseObjectMapper;
    }
}
