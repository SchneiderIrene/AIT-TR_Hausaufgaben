package hausaufgaben_21;

public class Main {
    public static void main(String[] args) {

        Car car = new Car (new String[]{"BMW", "Audi", "Mercedes"});
        car.findCar("Ford");
        car.findCar("BMW");
        car.findCar("Mercedes");
        car.findCar("Audi");
        car.findCar("Volvo");



    }
}
