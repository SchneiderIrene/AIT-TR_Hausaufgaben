package hausaufgaben_18;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 17);
        System.out.println("Student's 1 name is " + student1.name);
        System.out.println(student1.name + " is " + student1.age + " years old");

        System.out.println("------------------------------------------------------");

        Student student2 = new Student("Katya", 19);
        System.out.println("Student's 2 name is " + student2.name);
        System.out.println(student2.name + " is " + student2.age + " years old");

        System.out.println("------------------------------------------------------");

        Student student3 = new Student("Masha", 21);
        System.out.println("Student's 3 name is " + student3.name);
        System.out.println(student3.name + " is " + student3.age + " years old");

        System.out.println("**************************************************************");

        Rectangle r1 = new Rectangle(11,10);
        System.out.println("Square rectangle1 = " + r1.square());
        System.out.println("Perimeter rectangle1 = " + r1.perimeter());

        System.out.println("----------------------------------------------------------------");

        Rectangle r2 = new Rectangle(16,18);
        System.out.println("Square rectangle2 = " + r2.square());
        System.out.println("Perimeter rectangle2 = " +r2.perimeter());

        System.out.println("----------------------------------------------------------------");

        Rectangle r3 = new Rectangle(111,99);
        System.out.println("Square rectangle3 = " + r3.square());
        System.out.println("Perimeter rectangle3 = " +r3.perimeter());

        System.out.println("----------------------------------------------------------------");

    }
}
