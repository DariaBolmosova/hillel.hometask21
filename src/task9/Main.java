package task9;

public class Main {
    public static void main(String[] args) {
        mass();
        mass1();
    }

    public static void mass() {
        int[] massive = {-10, 20, 34, -11, 100, 20};
        int min = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (min > massive[i]) {
                min = massive[i];
            }
        }
        System.out.println("минимум = " + min);
    }

    public static void mass1() {
        double[] massive = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        double max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (max < massive[i]) {
                max = massive[i];
            }
        }
        System.out.println("максимум = " + max);
    }
}