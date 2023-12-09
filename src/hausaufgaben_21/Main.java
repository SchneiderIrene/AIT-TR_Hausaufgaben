package hausaufgaben_21;

public class Main {
    public static void main(String[] args) {

        Car salon = new Car (new String[]{"BMW", "Audi", "Mercedes"});
        salon.findCar("Ford");
        salon.findCar("BMW");
        salon.findCar("Mercedes");
        salon.findCar("Audi");
        salon.findCar("Volvo");



    }
}
