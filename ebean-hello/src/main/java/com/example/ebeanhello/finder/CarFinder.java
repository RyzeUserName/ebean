package com.example.ebeanhello.finder;

import com.example.ebeanhello.entity.Car;
import com.example.ebeanhello.entity.User;
import com.example.ebeanhello.entity.query.QCar;
import com.example.ebeanhello.entity.query.QUser;
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

    public QCar where() {
        return new QCar(db());
    }
    public QUser where() {
        return new QUser();
    }

}
