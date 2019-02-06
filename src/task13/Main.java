package task13;

import task6.Helper;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        massives();

    }

    public static int[] massives() {
        char password[] = new char[8];
        char smallChar[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char bigChar[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char specialSymbol[] = {'~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', '`', '-', '=', '{', '}', '[', ']', ':', ';', '<', '>', '.', '/'};
        char nums[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        password[0] = smallChar[Helper.getRandom(0, 25)];
        password[1] = bigChar[Helper.getRandom(0, 25)];
        password[2] = bigChar[Helper.getRandom(0, 25)];
        password[3] = smallChar[Helper.getRandom(0, 25)];
        password[4] = specialSymbol[Helper.getRandom(0, 25)];
        password[5] = nums[Helper.getRandom(0,8)];
        password[6] = nums[Helper.getRandom(0,8)];
       password[7] =nums[Helper.getRandom(0,8)];
        System.out.println("Пароль : " + Arrays.toString(password));
        return new int[0];
    }

}



