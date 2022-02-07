package com.turgaydede.singleResponsibility.bad;

public class Person {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void sendPasswordResetLink(Person person){
        System.out.println(person.getFirstName()+" kullanicisina sifre yenileme linki gonderildi");
    }

}
