package task7;

import task6.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма : "+sum());
        neChet();
        yearBday();
    }
    //1

    public static int sum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //2
    public static void neChet() {

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(" "+" "+i+" ");

            }

        }

    }

    //3
    public static void yearBday() {
        System.out.print("\n");
        System.out.println("Введите дату рождения : ");
        int data = Helper.getInputKeyboard();
        int calc = 2019 - data;
        System.out.println(" Вам " + calc + " !");
    }
}
