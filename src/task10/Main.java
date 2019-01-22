package task10;

import task6.Helper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        mass1();
        mass2();
        mass3();
        komanda();
        mass5();
        equalArrays();
        copyArray();
    }

    //1
    public static void mass1() {
        int sum = 0;
        int sum1 = 0;
        int[] mass = {3, 5, 7, 1, 12, 2, 4, 0};
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                sum += mass[i];
            } else {
                sum1 += mass[i];
            }
        }
        System.out.println("сумма чет. чисел = " + sum);
        System.out.println("cумма нечет. чисел = " + sum1);
        System.out.println("Результат операции = " + (sum - sum1));
    }

    //2
    public static void mass2() {
        char[] chArr = {'r', 'o', 'l', 'o', 'c'};
        char first = chArr[0];
        chArr[0] = chArr[chArr.length - 1];
        chArr[chArr.length - 1] = first;
        for (char e : chArr) {
            System.out.print(e + ";");
        }
        System.out.println();
    }

    //3
    public static void mass3() {
        double[] arr = {1, 2, 10, 5, 20, 3, 4};
        double min = arr[0];
        double max = arr[0];
        int min2 = 0;
        int max2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min2 = i;

            }
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                    max2 = j;
                }
            }
        }
        System.out.println("минимум = " + min);
        System.out.println("максимум = " + max);
        System.out.print("Массив До перестановки : ");
        for (double d : arr) {
            System.out.print(d + ";");
        }
        System.out.println();
        arr[min2] = max;
        arr[max2] = min;
        System.out.print("Массив После перестановки : ");
        for (double e : arr) {
            System.out.print(e + ";");
        }
        System.out.println();

    }

    //4
    public static void komanda() {
        int[] a = new int[25];
        int[] b = new int[25];
        int sum = 0;
        int sum1 = 0;
        int result;
        int result2;
        for (int i = 0; i < a.length; i++) {
            a[i] = Helper.getRandom(18, 56);
            sum += a[i];
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = Helper.getRandom(18, 56);
            sum1 += b[j];
        }
        result = (sum / a.length);
        result2 = (sum1 / b.length);
        System.out.println("Средний возраст учасников 1-й команды : " + result);
        System.out.println("Средний возраст учасников 2-й команды : " + result2);
        if(result>result2){
            System.out.println("У первой команды средний возраст больше ");
        }
        else if (result==result2){
            System.out.println("Средний возраст команд одинаковый");
        }
        else {
            System.out.println("У второй команды средний возраст больше ");
        }
        System.out.print("Возраст учасников первой команда : ");
        System.out.println(Arrays.toString(a));
        System.out.print("Возраст учасников второй команда : ");
        System.out.println(Arrays.toString(b));
    }

    //5
    public static void mass5() {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Массив в обратном порядке : ");
        for (int i = arr1.length - 1; i >= 0; i--) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

    }

    //6
    public static void equalArrays() {
        int a[] = {1, 2, 3};
        int a2[] = {1, 2, 4, 5};
        System.out.println("Массивы равны ? : " + Arrays.equals(a, a2));

    }

    //7
    public static int[] copyArray() {
        int src[] = {1, 2, 3, 4, 5, 8, 9};
        System.out.println("Исходный массив : " + Arrays.toString(src));
        int b[] = Arrays.copyOf(src, src.length);
        System.out.print("Копия элементов исходного массива : ");
        for (int e : b) {
            System.out.print(e + "," + " ");
        }
        System.out.println();
        return src;
    }

}


