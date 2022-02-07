package com.turgaydede.liskovSubstitution.bad;

public class DatabaseLogger extends Logger{
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
        System.out.println("Loglama yapildi");
    }
}
