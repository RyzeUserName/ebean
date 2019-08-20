package com.example.ebeanhello;

import com.example.ebeanhello.entity.Car;
import com.example.ebeanhello.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EbeanHelloApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        boolean add = userService.add();
        List<Car> allCars = userService.getAllCars();
        allCars.stream().forEach(a-> System.out.println(a.getId()));
        System.out.println("-----");
        userService.getAllUsers().stream().forEach(a-> System.out.println(a.getId()));
    }

}
