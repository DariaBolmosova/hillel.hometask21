package task12;

public class Main {
    public static void main(String[] args) {
        string();
    }

    public static void string() {
        String inStr = "Одесса мой город родной ";
        System.out.print("Найденные индексы для символа 'о': ");
        for (int i = 0; i <inStr.length() ; i++) {
            char result=inStr.charAt(i);
            if(result=='о'||result=='О'){
                System.out.print(i+",");
            }
        }
    }
}
