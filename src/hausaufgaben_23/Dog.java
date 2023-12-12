package hausaufgaben_23;

public class Dog extends Pets{
    String name;


    public Dog(String petsname, String name) {
        super(petsname);
        this.name = name;
        System.out.println("I am " + petsname + " " + name);
    }

    public  void sout (){
        System.out.println("I can bark");
    }

    public void walk (){
        System.out.println("I like walk");
    }
}
