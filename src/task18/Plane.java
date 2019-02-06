package task18;

public class Plane extends Transport {
    int soldTickets = 50;

    public Plane(int capacity, String type) {
        super(20, "fly");
    }

    public void numbersOfSeats() {
        int count = soldTickets - 150;
    }

    @Override
    public void move() {
        System.out.println("The plane is flying");

    }
}
