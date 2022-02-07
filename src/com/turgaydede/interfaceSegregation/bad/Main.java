package com.turgaydede.interfaceSegregation.bad;


/**
 *Sınıflar, kullanmadığı metotları içeren arayüzleri uygulamaya zorlanmamalıdır.
 * */
public class Main {
    public static void main(String[] args) throws Exception {
       RobotWorker robotWorker = new RobotWorker();
       robotWorker.eat(); // Not implemented!
       robotWorker.pay(); // Not implemented!
       robotWorker.work();
    }
}
