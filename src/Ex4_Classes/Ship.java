package Ex4_Classes;

public class Ship extends Device {
    private String manufacturer;
    private int countOfPeople;

    public Ship(String manufacturer, String name, int countOfPeople) {
        super(name);
        this.manufacturer = manufacturer;
        this.countOfPeople = Math.max(countOfPeople, 0);
    }

    @Override
    public void show() {
        System.out.println("\n\nПароход");
    }

    @Override
    public void sound() {
        System.out.println("Я могу сигналить и хлюпает вода, когда я плыву");
    }

    @Override
    public void desc() {
        System.out.println("Производитель: " + manufacturer + "\nМодель: " + name +
                "\nВместимость пассажиров:" + countOfPeople);
    }
}