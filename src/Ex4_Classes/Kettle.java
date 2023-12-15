package Ex4_Classes;

public class Kettle extends Device {
    private String manufacturer;
    private String power;
    private String waterVolume;

    public Kettle(String manufacturer, String name, String power, String waterVolume) {
        super(name);
        this.manufacturer = manufacturer;
        this.power = power;
        this.waterVolume = waterVolume;
    }

    @Override
    public void show() {
        System.out.println("\n\nЧайник");
    }

    @Override
    public void sound() {
        System.out.println("Я свисчу когда вода закипает");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + manufacturer + "\nМодель: " + name +
                "\nМощность:" + power + "\nОбъем воды: " + waterVolume);
    }
}
