import Ex5_Classes.MusicalInstrument;
import Ex5_Classes.Violin;
import Ex5_Classes.Trombone;
import Ex5_Classes.Ukulele;
import Ex5_Classes.Cello;

public class Ex5 {
    public static void main(String[] args) {


        System.out.println("\n");
        Violin violin = new Violin("Скрипка", "Струнный музыкальный инструмент",
                "Скрипка появилась в XVI веке");
        violin.sound();
        violin.show();
        violin.desc();
        violin.history();
        System.out.println("\n");

        Trombone trombone = new Trombone("Тромбон", "Духовой музыкальный инструмент",
                "Тромбон появился в XIV веке");
        trombone.sound();
        trombone.show();
        trombone.desc();
        trombone.history();
        System.out.println("\n");

        Ukulele ukulele = new Ukulele("Укулеле", "Струнный музыкальный инструмент",
                "Укулеле происходит из Гавайских островов");
        ukulele.sound();
        ukulele.show();
        ukulele.desc();
        ukulele.history();
        System.out.println("\n");

        Cello cello = new Cello("Виолончель🎻", "Струнный музыкальный инструмент",
                "Виолончель появилась в XVI-XVII веках");
        cello.sound();
        cello.show();
        cello.desc();
        cello.history();
    }
}
