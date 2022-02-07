package com.turgaydede.liskovSubstitution.bad;


/**
 * Alt sınıflardan oluşan nesnelerin, üst sınıfın nesneleri ile yer değiştirdiklerinde aynı
 * davranışı sergilemesi gerekmektedir.
 * */
public class Main {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.openConnection(); // Not implemented!
        fileLogger.closeConnection(); // Not implemented!
        fileLogger.log();
    }
}
