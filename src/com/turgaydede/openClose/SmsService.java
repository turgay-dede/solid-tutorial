package com.turgaydede.openClose;

public class SmsService implements NotificationService{
    @Override
    public void sendMessage() {
        System.out.println("Sms gönderildi");
    }
}
