package hometask2;

public class Main {

    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 12;
        double d = ((a + b) * (c / 2));  // a + b * ( c / 2 )
        double g = (((Math.pow(a, 2)) + (Math.pow(b, 2))) % 2); //  ( a2 + b2 ) % 2
        double k = ((a + b) / 12) * ((c % 4) + b);//( a + b ) / 12 * c % 4 + b
        double h = ((a - b) * c) / ((a + b) % c); //(a - b * c ) / ( a + b ) % c
        System.out.println("Результат выражения №1 : " + d);
        System.out.println("Результат выражения №2 : " + g);
        System.out.println("Результат выражения №3 : " + k);
        System.out.println("Результат выражения №4 : " + h);
        chetNechet();
    }

    public static void chetNechet() {
        int n = 100;
        if ((n % 2) == 0) {
            System.out.println("Результат операции: " + "Число " + n + " четное");
        } else {
            System.out.println("Результат операции: " + "Число " + n + " нечетное");
        }
    }
}
