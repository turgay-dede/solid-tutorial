package com.turgaydede.singleResponsibility.good;

public class EmailService {
    public void sendPasswordResetLink(Person person) {
        System.out.println(person.getFirstName()+" kullanicisina sifre yenileme linki gonderildi");
    }
}
