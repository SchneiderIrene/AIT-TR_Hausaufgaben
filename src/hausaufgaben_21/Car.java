package hausaufgaben_21;

import java.util.Arrays;

public class Car {
  String [] carToFind;

    public Car(String [] carToFind) {
        this.carToFind = carToFind;
    }

    public String toString() {
        return "Car" +
                "carToFind=" + Arrays.toString(carToFind);
    }

    public  void findCar(String order) {
        for (String c: carToFind){
            if (c.indexOf(order) >=0){
                System.out.println("Эта машина имеется в наличии");
                return;
            }
        }
        System.out.println("Такой машины нет , возьмите " + Arrays.toString(carToFind));
    }
}
