package com.turgaydede.dependencyInversion.good;
/**
 * Yüksek seviye sınıflar, düşük seviye sınıflara bağlı olmamalıdır. Her ikisi de soyutlamalara
 * bağlı olmalıdır.
 * Soyutlamalar, detaylara bağlı olmamalıdır. Detaylar, soyutlamalara bağlı olmalıdır
 * */
public class Main {
    public static void main(String[] args) {
        DatabaseService databaseService = new OracleDatabase();
        databaseService.add("data");
    }
}
