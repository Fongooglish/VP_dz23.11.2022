package org.example;

public class Addition implements Runnable {
    private int firstNumb;
    private int secondNumb;
    private int sum;

    public Addition(int firstNumb, int secondNumb) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
    }


    public void setFirstNumb(int firstNumb) {
        this.firstNumb = firstNumb;
    }

    public void setSecondNumb(int secondNumb) {
        this.secondNumb = secondNumb;
    }

    @Override
    public void run() {
        System.out.println("Запуск многопоточного режима...");
        System.out.println(Thread.currentThread());
        System.out.println("Сумма введенных чисел: " + (sum = firstNumb + secondNumb));
    }
}
