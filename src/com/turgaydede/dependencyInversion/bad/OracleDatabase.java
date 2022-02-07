package com.turgaydede.dependencyInversion.bad;

public class OracleDatabase {
    public void add(Object object) {
        System.out.println("Oracle eklendi: " + object);
    }

}
