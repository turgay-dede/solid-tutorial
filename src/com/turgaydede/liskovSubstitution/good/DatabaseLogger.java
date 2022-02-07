package com.turgaydede.liskovSubstitution.good;

public class DatabaseLogger extends ConnectableLogger {
    @Override
    public void openConnection() {
        System.out.println("Baglanti acildi");
    }

    @Override
    public void closeConnection() {
        System.out.println("Baglanti kapandi");
    }

    @Override
    public void log() {
        System.out.println("Database loglama yapildi");
    }
}
