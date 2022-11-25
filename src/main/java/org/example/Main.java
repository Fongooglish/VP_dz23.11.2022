package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1 (Easy): создайте пример простого однопоточного приложения");
        MultiplicationTable.Calculation();

        System.out.println();
        System.out.println();

        System.out.println("Задание №2 (Medium): создайте пример приложения расчета суммы двух чисел в многопоточном режиме, ввод числе идет с клавиатуры");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число №1: ");
        int a = scanner.nextInt();
        System.out.println("Введите число №2: ");
        int b = scanner.nextInt();
        System.out.println(Thread.currentThread());
        Thread newThread = new Thread(new Addition(a,b));
        newThread.start();

        System.out.println();
        System.out.println();
        System.out.println("Задание №3: Получите всю строковую информацию с главной страницы Википедии");
        Wiki.wikiParser();
    }
}