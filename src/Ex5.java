import Ex5_Classes.MusicalInstrument;
import Ex5_Classes.Violin;
import Ex5_Classes.Trombone;
import Ex5_Classes.Ukulele;
import Ex5_Classes.Cello;

public class Ex5 {
    public static void main(String[] args) {


        System.out.println("\n");
        Violin violin = new Violin("Скрипка", "31.75 - 35,5 см");
        violin.show();
        violin.desc();
        violin.sound();
        violin.history();
        System.out.println("\n");

        Trombone trombone = new Trombone("Тромбон", " 94x31x29 см");
        trombone.show();
        trombone.desc();
        trombone.sound();
        trombone.history();
        System.out.println("\n");

        Ukulele ukulele = new Ukulele("Укулеле", "33.0 - 53 см");
        ukulele.show();
        ukulele.desc();
        ukulele.sound();
        ukulele.history();
        System.out.println("\n");

        Cello cello = new Cello("Виолончель", "51.0 - 69.5 см");
        cello.show();
        cello.desc();
        cello.sound();
        cello.history();
        System.out.println("\n");
    }
}
