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
}


