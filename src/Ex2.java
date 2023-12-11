import Ex2_Classes.Animal;
import Ex2_Classes.Tiger;
import Ex2_Classes.Crocodile;
import Ex2_Classes.Kangaroo;

public class Ex2 {
    public static void main(String[] args) {

        System.out.println("\nКласс Animal");
        Animal animal = new Animal();
        animal.input();
        animal.print();

        Animal animal1 = new Animal("Кот");
        animal1.print();


        System.out.println("\n\nКласс Tiger");
        Tiger tiger = new Tiger();
        tiger.input();
        tiger.print();

        Tiger tiger1 = new Tiger("Тигр", 50);
        tiger1.print();


        System.out.println("\n\nКласс Crocodile");
        Crocodile crocodile = new Crocodile();
        crocodile.input();
        crocodile.print();

        Crocodile crocodile1 = new Crocodile("Крокодил", 13);
        crocodile1.print();


        System.out.println("\n\nКласс Kangaroo");
        Kangaroo kangaroo = new Kangaroo();
        kangaroo.input();
        kangaroo.print();

        Kangaroo kangaroo1 = new Kangaroo("Кенгуру", 4);
        kangaroo1.print();


    }
}