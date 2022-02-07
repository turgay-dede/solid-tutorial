package com.turgaydede.dependencyInversion.good;

public class MysqlDatabase implements DatabaseService {
    @Override
    public void add(Object object) {
        System.out.println("Mysql eklendi: " + object);
    }
}
