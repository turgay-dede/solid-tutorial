package com.turgaydede.liskovSubstitution.bad;

public abstract class Logger {
    public abstract void openConnection();
    public abstract void closeConnection();
    public abstract void log();
}
