package Ex4_Classes;

public class Microwave extends Device {
    private String manufacturer;
    private String power;
    private String volume;

    public Microwave(String manufacturer, String name, String power, String volume) {
        super(name);
        this.manufacturer = manufacturer;
        this.power = power;
        this.volume = volume;
    }

    @Override
    public void show() {
        System.out.println("\n\nМикроволновка");
    }

    @Override
    public void sound() {
        System.out.println("Я жужжу когда грею еду");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + manufacturer + "\nМодель: " + name +
                "\nМощность:" + power + "\nОбъем(Вместительность): " + volume);
    }
}