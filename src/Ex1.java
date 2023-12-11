import Ex1.Human;
import Ex1.Builder;
import Ex1.Sailor;
import Ex1.Pilot;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("\nКласс Human");
        Human human = new Human();
        human.input();
        human.print();

        Human human1 = new Human("Иван", 30);
        human1.print();


        System.out.println("\n\nКласс Builder");
        Builder builder = new Builder();
        builder.input();
        builder.print();

        Builder builder1 = new Builder("Иван", 30, "Каменщик");
        builder1.print();


        System.out.println("\n\nКласс Sailor");
        Sailor sailor = new Sailor();
        sailor.input();
        sailor.print();

        Sailor sailor1 = new Sailor("Петр", 25, "Матрос");
        sailor1.print();


        System.out.println("\n\nКласс Pilot");
        Pilot pilot = new Pilot();
        pilot.input();
        pilot.print();

        Pilot pilot1 = new Pilot("Алексей", 35, "Истребитель");
        pilot1.print();


    }
}