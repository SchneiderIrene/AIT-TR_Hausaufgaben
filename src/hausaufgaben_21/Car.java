package hausaufgaben_21;

import java.util.Arrays;

public class Car {
  String [] salon;

    public Car(String [] salon) {
        this.salon = salon;
    }

    public String toString() {
        return "Car" +
                "carToFind=" + Arrays.toString(salon);
    }

    public  void findCar(String carToFind) {
        for (String c: salon){
            if (c.indexOf(carToFind) >=0){
                System.out.println("Эта машина имеется в наличии");
                return;
            }
        }
        System.out.print("Такой машины нет , возьмите ");
        for (String c: salon){
            System.out.print(c + ", ");
        }
        System.out.println();
    }
}
