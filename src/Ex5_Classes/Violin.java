package Ex5_Classes;

public class Violin extends MusicalInstrument {
    public Violin(String name, String size) {
        super.name = name;
        super.instrumensize = size;
    }

    @Override
    public void show() {
        System.out.println(name + "\nPазмер: " + instrumensize);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает высокий звук с помощью струн и смычка.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\tCмычковый музыкальный инструмент с четырьмя струнами");
    }

    @Override
    public void history() {
        System.out.println("Наиболее ранние изображения скрипок близкой к классической формы\nвстречаются в скульптурных композициях начала XVI века ");
    }
}