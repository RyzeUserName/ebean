package com.example.ebeanhello.entity;

import com.example.ebeanhello.finder.UserFinder;
import io.ebean.Model;
import io.ebean.annotation.Aggregation;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-21 10:44
 */
@Entity
@Getter
@Setter
public class User extends Model {
    // finder linked as a public static field
    public static final UserFinder find = new UserFinder();
    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private Byte sex;
    private Timestamp birthday;
    private Integer age;
    @Aggregation("count(*)")
    private Long count;
}
