package com.example.ebeanhello.service;

import com.example.ebeanhello.entity.Car;
import com.example.ebeanhello.entity.User;
import io.ebean.PagedList;
import io.ebean.annotation.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-21 10:47
 */
@Service
public class UserService {

    private Integer i = 1;

    public boolean save() {
        User user = new User();
        user.setName("名字" + i);
        user.setSex((byte) 0);
        user.setBirthday(new Timestamp(new java.util.Date().getTime()));
        user.setAge(i);
        user.save();
        i++;
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean back() {
        User user = new User();
        user.setName("测试回滚");
        user.setSex((byte) 0);
        user.setBirthday(new Timestamp(new java.util.Date().getTime()));
        user.setAge(1);
        user.save();
        int i = 1 / 0;
        User user1 = new User();
        user1.setName("测试回滚1");
        user1.setSex((byte) 0);
        user1.setBirthday(new Timestamp(new java.util.Date().getTime()));
        user1.setAge(1);
        user1.save();
        return true;
    }

    public List<User> findAll() {
        return User.find.all();
    }


    public User findById(Integer id) {
        return User.find.byId(id);
    }

    public List<User> page() {
        PagedList<User> pagedList = User.find.query().where().setFirstRow(4).setMaxRows(2).findPagedList();
        pagedList.loadCount();
        // fetch and return the list in the foreground thread
        List<User> orders = pagedList.getList();

        // get the total row count (from the future)
        int totalRowCount = pagedList.getTotalCount();
        int pageSize = pagedList.getPageSize();
        int pageIndex = pagedList.getPageIndex();

        return orders;
    }

    public Car car(Integer id) {
        return Car.find.byId(id);
    }
}