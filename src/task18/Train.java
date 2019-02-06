package task18;

public class Train extends Transport {
    int numOfCars;

    public Train(int capacity, String type) {
        super(20, "ride");
    }
    public void getNumOfCar(){
        numOfCars=10;
    }
    @Override
    public void move() {
        System.out.println("The plane is ride");
    }
}
