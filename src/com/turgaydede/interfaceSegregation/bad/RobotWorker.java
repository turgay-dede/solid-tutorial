package com.turgaydede.interfaceSegregation.bad;

public class RobotWorker implements Worker{
    @Override
    public void eat() {
        System.out.println("Not implemented!");
    }

    @Override
    public void work() {
        System.out.println("Robot calisiyor");
    }

    @Override
    public void pay() {
        System.out.println("Not implemented!");
    }
}
