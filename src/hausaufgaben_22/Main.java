package hausaufgaben_22;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 6));
        System.out.println(calculator.sum(5.67, 6));
        System.out.println(calculator.sum(89, 78, 1));
        System.out.println(calculator.sum(89, 78, 1.25));


        System.out.println(calculator.sub(45, 8));
        System.out.println(calculator.sub(45.56, 4.85));
        System.out.println(calculator.sub(81, 9, 5));
        System.out.println(calculator.sub(81.67, 8.11, 5.34));

    }
}
