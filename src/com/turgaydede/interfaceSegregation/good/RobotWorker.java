package com.turgaydede.interfaceSegregation.good;

public class RobotWorker implements WorkerService{
    @Override
    public void work() {
        System.out.println("Robot calisiyor");
    }
}
