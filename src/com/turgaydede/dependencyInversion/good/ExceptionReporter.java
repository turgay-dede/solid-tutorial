package com.turgaydede.dependencyInversion.good;

public class ExceptionReporter {
    private DatabaseService database;
    public ExceptionReporter(DatabaseService database) {
        this.database = database;
    }
    public void reportException(Exception exception) {
        database.add(exception);
    }
}
