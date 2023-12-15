import Ex2_Classes.Animal;
import Ex2_Classes.Tiger;
import Ex2_Classes.Crocodile;
import Ex2_Classes.Kangaroo;

public class Ex2 {
    public static void main(String[] args) {


        System.out.println("\n\nКласс Tiger");
        Tiger tiger1 = new Tiger("Тигр", 3, 300);
        tiger1.print();


        System.out.println("\n\nКласс Crocodile");
        Crocodile crocodile1 = new Crocodile("Крокодил", 4, 35);
        crocodile1.print();


        System.out.println("\n\nКласс Kangaroo");
        Kangaroo kangaroo1 = new Kangaroo("Кенгуру", 2, 50);
        kangaroo1.print();


    }
}