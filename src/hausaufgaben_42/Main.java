package hausaufgaben_42;

public class Main {
    public static void main(String[] args) {




        try {
            //int a = 40/0;

//            String s =null;
//            String m = s.toLowerCase();

            int[] m = new int[2];
             m[8]=5;

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Es is " + e.getClass());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Es is Exception: " + e.getClass());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Exception: " + e.getClass());

        }


    }
}
