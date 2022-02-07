package com.turgaydede.dependencyInversion.good;

public class OracleDatabase implements DatabaseService {
    @Override
    public void add(Object object) {
        System.out.println("Oracle eklendi: " + object);
    }
}
