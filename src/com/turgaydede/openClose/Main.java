package com.turgaydede.openClose;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new SmsService();
        notificationService.sendMessage();
    }
}
