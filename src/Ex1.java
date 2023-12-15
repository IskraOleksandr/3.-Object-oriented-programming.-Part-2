import Ex1_Classes.Human;
import Ex1_Classes.Builder;
import Ex1_Classes.Sailor;
import Ex1_Classes.Pilot;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("\n\nКласс Builder");
        Builder builder1 = new Builder("Иван", 30);
        builder1.print();


        System.out.println("\n\nКласс Sailor");
        Sailor sailor1 = new Sailor("Петр", 25);
        sailor1.print();


        System.out.println("\n\nКласс Pilot");
        Pilot pilot1 = new Pilot("Алексей", 35);
        pilot1.print();


    }
}