package com.turgaydede.openClose;

public class MailService implements NotificationService{
    @Override
    public void sendMessage() {
        System.out.println("Mail gönderildi");
    }
}
