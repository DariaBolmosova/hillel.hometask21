package task6;

import java.util.Scanner;

public class Helper {
    public static int getInputKeyboard(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int getRandom(int min, int max) {
        int r = (int) ((max - min+1) * Math.random()) + min;
        return r;
    }
    public static void fillRandomArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=Helper.getRandom(0,100);

        }
    }
    public static void showArray(int[]arr){
        for (int e:arr) {
            System.out.printf("[%d]",e);
        }
        System.out.printf("\n");
    }
    public static void swap(int[]arr,int ind1,int ind2) {
        int old=arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=old;
    }
}


