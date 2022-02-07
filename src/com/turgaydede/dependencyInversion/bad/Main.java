package com.turgaydede.dependencyInversion.bad;

import com.turgaydede.dependencyInversion.good.DatabaseService;
import com.turgaydede.dependencyInversion.good.OracleDatabase;

public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new OracleDatabase();
        databaseService.add("data");
    }
}
