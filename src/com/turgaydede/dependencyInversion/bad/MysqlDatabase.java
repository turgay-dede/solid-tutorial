package com.turgaydede.dependencyInversion.bad;

public class MysqlDatabase {
    public void add(Object object) {
        System.out.println("Mysql eklendi: " + object);
    }
}
