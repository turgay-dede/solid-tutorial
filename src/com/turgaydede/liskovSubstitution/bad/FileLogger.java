package com.turgaydede.liskovSubstitution.bad;

public class FileLogger extends Logger {
    @Override
    public void openConnection() {
        System.out.println("Not implemented!");
    }

    @Override
    public void closeConnection() {
        System.out.println("Not implemented!");
    }

    @Override
    public void log() {
        System.out.println("Loglama yapildi");
    }

}
