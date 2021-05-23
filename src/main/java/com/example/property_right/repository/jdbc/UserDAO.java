package com.example.property_right.repository.jdbc;

import com.example.property_right.model.User;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDAO extends GenericDaoImpl<User> {

    private static final String TABLE_NAME = "users";
    private static final String ID_COLUMN = "id";

    public UserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
        setTable(TABLE_NAME);
        setPrimaryKey(ID_COLUMN);
    }

    @Autowired
    private BaseObjectMapper<User> userBaseObjectMapper;

    @Override
    protected BaseObjectMapper<User> getObjectMapper() {
        return userBaseObjectMapper;
    }
}
