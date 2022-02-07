package com.turgaydede.liskovSubstitution.good;

/**
 * Alt sınıflardan oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiklerinde aynı
 * davranışı sergilemesi gerekmektedir.
 * */
public class Main {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log();

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.openConnection();
        databaseLogger.closeConnection();
        databaseLogger.log();
    }
}
