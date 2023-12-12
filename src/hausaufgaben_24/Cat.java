package hausaufgaben_24;

public class Cat extends Pets{
    String name;


    public Cat(String petsname, String name) {
        super(petsname);
        this.name = name;
        System.out.println("I am " + petsname + " " + name);
    }
    public  void sout (){
        System.out.println("I can meow");
    }
    public void walk (){
        System.out.println("I do not like walk");
    }
}
