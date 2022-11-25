package org.example;

public class MultiplicationTable {
    public static void Calculation() {
        System.out.println("Таблица умножения:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

    }
}
