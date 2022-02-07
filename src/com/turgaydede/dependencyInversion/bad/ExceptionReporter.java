package com.turgaydede.dependencyInversion.bad;

public class ExceptionReporter {
    private OracleDatabase oracleDatabase;
    public ExceptionReporter() {
        oracleDatabase = new OracleDatabase();
    }
    public void reportException(Exception exception) {
        oracleDatabase.add(exception);
    }

}
