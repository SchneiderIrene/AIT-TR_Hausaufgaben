package hausaufgaben_22;

public class Calculator {

    public  double sum (double a, double b){
        System.out.print(a + " + " + b + " = ");
        return a+b;
    }
    public  double sum (double a, double b, double c){
        System.out.print(a + " + " + b + " + " + c + " = ");
        return a+b+c;
    }

    public  int sum (int a, int b){
        System.out.print(a + " + " + b + " = ");
        return a+b;
    }
    public  int sum (int a, int b, int c) {
        System.out.print(a + " + " + b + " + " + c + " = ");
        return a + b + c;
    }




    public  double sub (double a, double b){
        System.out.print(a + " - " + b + " = ");
        return a-b;
    }
    public  double sub (double a, double b, double c){
        System.out.print(a + " - " + b + " - " + c + " = ");
        return a-b-c;
    }
    public  int sub (int a, int b){
        System.out.print(a + " - " + b + " = ");
        return a-b;
    }
    public  int sub (int a, int b, int c){
        System.out.print(a + " - " + b + " - " + c + " = ");
        return a-b-c;
    }
}
