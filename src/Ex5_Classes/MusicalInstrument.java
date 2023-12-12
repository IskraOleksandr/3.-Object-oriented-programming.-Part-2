package Ex5_Classes;

public class MusicalInstrument {
    private String name;
    private String characteristics;
    private String history;

    public MusicalInstrument(String name, String characteristics, String history) {
        this.name = name;
        this.characteristics = characteristics;
        this.history = history;
    }

    public void sound() {
        System.out.println("Звук музыкального инструмента: " + name);
    }

    public void show() {
        System.out.println("Название музыкального инструмента: " + name);
    }

    public void desc() {
        System.out.println("Описание музыкального инструмента: " + characteristics);
    }

    public void history() {
        System.out.println("История создания музыкального инструмента: " + history);
    }
}
