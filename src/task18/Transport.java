package task18;

public class Transport {

    int capacity;
    String color;
    String type;

    public Transport(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public void move(){
        System.out.println("Transport began to move");
    }
}
