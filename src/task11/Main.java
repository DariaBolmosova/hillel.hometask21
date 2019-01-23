package task11;

import task6.Helper;

public class Main {
    public static void main(String[] args) {
        int[] mass = new int[10];
        Helper.fillRandomArray(mass);
        System.out.print("Исходный массив : ");
        Helper.showArray(mass);
        System.out.print("Сортировка методом “выбора” : ");
        sort1(mass);
        Helper.showArray(mass);
        System.out.print("Пузырьковая сортировка  : ");
        bubble(mass);
        Helper.showArray(mass);

    }

    //1
    public static void sort1(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            int min1 = getMin(mass, i);
            Helper.swap(mass, i, min1);
        }
    }

    public static int getMin(int[] arr, int value) {
        int min1 = value;
        int min = arr[min1];
        for (int i = value; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                min1 = i;
            }
        }
        return min1;
    }

    //2
    public static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }
        }
    }
}
