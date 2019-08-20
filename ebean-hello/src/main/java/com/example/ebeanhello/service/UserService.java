package com.example.ebeanhello.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.example.ebeanhello.entity.Car;
import com.example.ebeanhello.entity.User;
import io.ebean.EbeanServer;
import io.ebean.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-20 16:32
 */
@Service
public class UserService {

    @Autowired
    private EbeanServer ebeanServer;

    private Integer i = 0;
    private Integer j = 0;

    @Transactional(rollbackFor = Exception.class)
    public boolean add() {
        User user = new User();
        user.setName("user" + i);
        user.setSex(i / 2 == 0 ? (byte) 0 : (byte) 1);
        user.setBirthday(new Timestamp(new java.util.Date().getTime()));
        user.setAge(i);
        ebeanServer.insert(user);
        i++;
        List<Car> cars = new ArrayList<>();
        Car car = new Car();
        car.setColour("colour" + j);
        car.setEngine("engine" + j);
        car.setSeat(j);
        cars.add(car);
        j++;
        Car car1 = new Car();
        car1.setColour("colour" + j);
        car1.setEngine("engine" + j);
        car1.setSeat(j);
        j++;
        cars.add(car1);
        ebeanServer.insertAll(cars);
        return true;
    }

    public List<User> getAllUsers() {
        return ebeanServer.find(User.class).findList();
    }
    public List<Car> getAllCars() {
        return ebeanServer.find(Car.class).findList();
    }
}
