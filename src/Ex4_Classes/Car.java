package Ex4_Classes;

public class Car extends Device {
    private String manufacturer;
    private String cartype;
    private int year;
    private String engineVolume;

    public Car(String manufacturer, String name, String cartype, int year, String engineVolume) {
        super(name);
        this.manufacturer = manufacturer;
        this.cartype = cartype;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    @Override
    public void show() {
        System.out.println("\n\nАвтомобиль");
    }

    @Override
    public void sound() {
        System.out.println("У меня красиво звучит двигатель и я могу сигналить");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + manufacturer + "\nМодель: " + name +
                "Тип кузова: " + cartype + "\nГод выпуска: " + year +
                "\nОбъем двигателя: " + engineVolume);
    }
}