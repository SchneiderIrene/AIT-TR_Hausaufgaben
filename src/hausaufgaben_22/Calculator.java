package hausaufgaben_22;

public class Calculator {

    public double sum (double a, double b){
        System.out.print(a + " + " + b + " = ");
        return a+b;
    }
    public double sum (double a, double b, double c){
        System.out.print(a + " + " + b + " + " + c + " = ");
        return a+b+c;
    }

    public double sub (double a, double b){
        System.out.print(a + " - " + b + " = ");
        return a-b;
    }
    public double sub (double a, double b, double c){
        System.out.print(a + " - " + b + " - " + c + " = ");
        return a-b-c;
    }
}
