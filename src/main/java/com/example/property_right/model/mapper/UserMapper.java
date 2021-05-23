package com.example.property_right.model.mapper;

import com.example.property_right.model.User;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UserMapper implements BaseObjectMapper<User> {

    public static final String SELECT_SQL =
            "SELECT * FROM users";

    @Override
    public Map<String, Object> mapObject(User obj) {
        Map<String, Object> res = new HashMap<>();
        res.put("id", obj.getId());
        res.put("email", obj.getEmail());
        res.put("name", obj.getEmail());
        res.put("lastName", obj.getLastName());
        res.put("patronymic", obj.getPatronymic());
        res.put("password", obj.getPassword());
        return res;
    }

    @Override
    public String getSelectSql() {
        return SELECT_SQL;
    }

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String email = resultSet.getString("email");
        String lastName = resultSet.getString("lastName");
        String patronymic = resultSet.getString("patronymic");
        String password = resultSet.getString("password");
        return User.builder()
                .id(id)
                .email(email)
                .lastName(lastName)
                .patronymic(patronymic)
                .password(password)
                .build();
    }
}
