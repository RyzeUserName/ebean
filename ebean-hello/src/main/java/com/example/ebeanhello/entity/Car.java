package com.example.ebeanhello.entity;

import javax.persistence.*;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-20 16:26
 */
@Entity
public class Car {
    private Integer id;
    private String colour;
    private String engine;
    private Integer seat;

    @Id
    @Column(name = "id")
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "colour")
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Basic
    @Column(name = "engine")
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Basic
    @Column(name = "seat")
    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (id != null ? !id.equals(car.id) : car.id != null) return false;
        if (colour != null ? !colour.equals(car.colour) : car.colour != null) return false;
        if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
        if (seat != null ? !seat.equals(car.seat) : car.seat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        result = 31 * result + (seat != null ? seat.hashCode() : 0);
        return result;
    }
}
