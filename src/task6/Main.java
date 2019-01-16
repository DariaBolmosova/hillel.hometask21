package task6;

public class Main {
    public static void main(String[] args) {
        count();
        System.out.println("n! : " + fact(4));
        progress();
    }

    //1
    public static void count() {
        int counter = 10;
        do {
            System.out.println("осталось : " + counter);
        } while (--counter > 0);
    }

    //2
    public static int fact(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }

    //3
    public static void progress() {
        System.out.println("Введите  значение 1-го элемента : ");
        int a = Helper.getInputKeyboard();
        System.out.println("Введите разность : ");
        int d = Helper.getInputKeyboard();
        System.out.println("Введите n : ");
        int n = Helper.getInputKeyboard();
        int res;
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = (a + i) * d;
            res = a + (n - 1) * d;
            System.out.println("Последний член an = " + res + " ; " + "прогресиия = " + sum);
        }
    }

}
