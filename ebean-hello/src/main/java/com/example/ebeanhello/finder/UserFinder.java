package com.example.ebeanhello.finder;

import com.example.ebeanhello.entity.User;
import com.example.ebeanhello.entity.query.QUser;
import io.ebean.Finder;

/**
 * 描述
 * @author Ryze
 * @date 2019-08-21 10:59
 */
public class UserFinder extends Finder<Integer, User> {
    public UserFinder() {
        super(User.class);
    }
    public QUser where() {
        return new QUser(db());
    }
}
