package com.example.ebeanhello.entity;

import com.example.ebeanhello.finder.CarFinder;
import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * 描述
 * @author Ryze
 * @date 2019/8/28 0:26
 */
@Getter
@Setter
@Entity
public class Car extends Model {
    // finder linked as a public static field
    public static final CarFinder find = new CarFinder();
    @Id
    @GeneratedValue
    private Integer id;

    private String colour;
    private String engine;
    private Integer seat;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
