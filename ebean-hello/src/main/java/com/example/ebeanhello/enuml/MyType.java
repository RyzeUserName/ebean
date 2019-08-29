package com.example.ebeanhello.enuml;

public enum MyType implements BaseEnum {
    TYPE_ONE(1),TYPE_TWO(2);
    private  Integer num;

    MyType(Integer num) {
        this.num = num;
    }

    @Override
    public Integer getValue() {
        return this.num;
    }
}
