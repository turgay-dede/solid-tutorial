package com.turgaydede.liskovSubstitution.good;

public class FileLogger extends Logger{
    @Override
    public void log() {
        System.out.println("Dosyaya loglama yapildi");
    }
}
