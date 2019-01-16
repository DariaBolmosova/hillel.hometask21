package task8;


import task6.Helper;


public class Main {
    public static void main(String[] args) {
        kvadrat();
        //orelResha();
        sumChisel();
        guessNumber();

    }

    //4
    public static void kvadrat() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("X");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }


    }

    //1
    public static void orelResha() {
        int orel = 0;
        int reshka = 0;
        for (int i = 0; i < 2000; i++) {
            int rnd = Helper.getRandom(0, 1);
            System.out.println(rnd);
            if (rnd == 0) {
                orel++;
            } else {
                reshka++;
            }
        }System.out.println("орел выпал =  " + orel + "решка выпала = " + reshka);
    }

    //2
    public static void sumChisel() {
        int[] a = new int[100];
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            a[i] = Helper.getRandom(-10, 10);
        }
        for (int element : a) {
            sum += element;
        }
        System.out.println("Сумма чисел : " + sum);
    }

    //3
    public static void guessNumber() {

        int number1;
        int number2 = Helper.getRandom(1, 10);
        do {
            System.out.println("Введите число от 1 до 10 : ");
            number1 = Helper.getInputKeyboard();
            if (number1 < number2) {
                System.out.println("Число меньше !");
            } else if (number1 > number2) {
                System.out.println("Число больше !");
            } else {
                System.out.println(" Вы угадали число !");
            }
        }
        while (number1 != number2);
    }
}

