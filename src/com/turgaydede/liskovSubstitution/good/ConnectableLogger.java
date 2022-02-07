package com.turgaydede.liskovSubstitution.good;

public abstract class ConnectableLogger extends Logger{
    public abstract void openConnection();
    public abstract void closeConnection();
}
