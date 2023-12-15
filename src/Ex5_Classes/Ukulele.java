package Ex5_Classes;

public class Ukulele extends MusicalInstrument {
    public Ukulele(String name, String size) {
        super.name = name;
        super.instrumensize = size;
    }

    @Override
    public void show() {
        System.out.println(name + "\nPазмер: " + instrumensize);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает высокий звук с помощью струн и пальцев.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\tCтрунный музыкальный инструмент с четырьмя струнами, разновидность гитары");
    }

    @Override
    public void history() {
        System.out.println("Укулеле появилась на Гавайских островах во второй половине XIX века\nГавайцы используют для исполнения сентиментальных песен");
    }
}