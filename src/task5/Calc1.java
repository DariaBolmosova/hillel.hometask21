package task5;

public class Calc1 {
    public static void season1(int a){
        if (a == 1||a==2||a==12) {
            System.out.println("Время года: Зима ");
        }else if (a==3||a==4||a==5){
            System.out.println("Время года: Весна");
        }else if (a==6||a==7||a==8){
            System.out.println("Время года: Лето");
        }else if (a==9||a==10||a==11){
            System.out.println("Время года: Осень");
    }
        else {
            System.out.println("Введите цирфу от 1 до 12 !!!");
        }
    }
    public static void season2(int a1){
        switch (a1){
            case 1:
            case 2:
            case 12:
                System.out.println("Время года- Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года- Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года- Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года-Осень");
                break;
                default:
                    System.out.println("Введите цифру в диапазоне от 1 до 12!!");

        }
    }
    public static long bitDivByFour(double number){
        return ((long)number)>>2;
    }


}
