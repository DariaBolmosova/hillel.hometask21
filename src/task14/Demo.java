package task14;

public class Demo {
    private static int NUM1 = 120;
    private static double NUM2 = 29.4;
    private static String company = "RGL Group";

    public int minSalary = 3200;
    double coefficient = 1.7;
    private int bonus = 250;
    private int fine = 50;

    Demo demo=new Demo();
    Demo demo1=new Demo();
    Demo demo2=new Demo();

    public static void count(){
        int result =NUM1*30;
    }
    private void addbonus(){
        int result =minSalary*bonus;

    }
    void getbonus(){
        double result=bonus*coefficient;
    }



}