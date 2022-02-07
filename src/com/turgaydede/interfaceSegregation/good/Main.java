package com.turgaydede.interfaceSegregation.good;

import java.awt.*;

/**
 *Sınıflar, kullanmadığı metotları içeren arayüzleri uygulamaya zorlanmamalıdır.
 * */
public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.eat();
        worker.work();
        worker.pay();

        RobotWorker robot = new RobotWorker();
        robot.work();
    }
}
