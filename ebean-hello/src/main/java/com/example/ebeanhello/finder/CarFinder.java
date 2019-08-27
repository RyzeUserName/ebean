package com.example.ebeanhello.finder;

import com.example.ebeanhello.entity.Car;
import com.example.ebeanhello.entity.User;
import io.ebean.Finder;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-21 10:59
 */
public class CarFinder extends Finder<Integer, Car> {
    public CarFinder() {
        super(Car.class);
    }
}