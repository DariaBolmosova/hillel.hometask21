package task5;

import task4.Calc;

import java.util.Scanner;

public class Main {
    public  static void main(String[]args){
        Scanner s=new Scanner(System.in);
        //1
        System.out.println("Введите цифру от 1 до 12 : ");
        int a=s.nextInt();
        Calc1.season1(a);
        //2
        System.out.println("Введите цифру от 1 до 12");
        int a1=s.nextInt();
        Calc1.season2(a1);

//3
        long l=Calc1.bitDivByFour(100);
        System.out.println(l);
        long l1=Calc1.bitDivByFour(32);
        System.out.println(l1);
        long l2=Calc1.bitDivByFour(8);
        System.out.println(l2);
        long l3=Calc1.bitDivByFour(6);
        System.out.println(l3);
        long l4=Calc1.bitDivByFour(4);
        System.out.println(l4);
        long l5=Calc1.bitDivByFour(3);
        System.out.println(l5);
        long l6=Calc1.bitDivByFour(1);
        System.out.println(l6);
    }


}
