package com.turgaydede.interfaceSegregation.good;

public class Worker implements WorkerService,EatableWorkerService,PayableWorkerService{
    @Override
    public void eat() {
        System.out.println("Calisan yemek yiyor");
    }

    @Override
    public void pay() {
        System.out.println("Calisana maasi ödeniyor");
    }

    @Override
    public void work() {
        System.out.println("Calisan calisiyor");
    }
}
