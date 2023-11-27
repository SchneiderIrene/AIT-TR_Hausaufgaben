package hausaugaben_13;

public class HA_13_01 {
    public static void main(String[] args) {
    String fruits [] = {"Orange", "Apple" ,"Banana" ,"Mango"};
    for (int i = 0; i<fruits.length; i++){
        System.out.println(fruits[i]);
    }
        System.out.println("-------------------------------------");
    fruits[0] = "Kiwi";
        for (int i = 0; i<fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
