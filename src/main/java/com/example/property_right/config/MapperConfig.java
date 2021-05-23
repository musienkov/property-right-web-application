package com.example.property_right.config;

import com.example.property_right.model.Car;
import com.example.property_right.model.House;
import com.example.property_right.model.PropertyRight;
import com.example.property_right.model.User;
import com.example.property_right.model.mapper.CarMapper;
import com.example.property_right.model.mapper.HouseMapper;
import com.example.property_right.model.mapper.PropertyRightMapper;
import com.example.property_right.model.mapper.UserMapper;
import com.example.property_right.model.mapper.generic.BaseObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MapperConfig {
    @Bean
    public BaseObjectMapper<Car> attendanceBaseObjectMapper(){
        return new CarMapper();
    }
    @Bean
    public BaseObjectMapper<House> attendanceTypeBaseObjectMapper(){
        return new HouseMapper();
    }
    @Bean
    public BaseObjectMapper<PropertyRight> courseBaseObjectMapper(){
        return new PropertyRightMapper();
    }
    @Bean
    public BaseObjectMapper<User> groupBaseObjectMapper(){
        return new UserMapper();
    }

}
