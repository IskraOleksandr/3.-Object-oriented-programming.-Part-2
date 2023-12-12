import Ex4_Classes.Device;
import Ex4_Classes.Kettle;
import Ex4_Classes.Microwave;
import Ex4_Classes.Car;
import Ex4_Classes.Ship;

public class Ex4 {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Kettle", "Capacity: 1.7L, Power: 1500W");
        kettle.sound();
        kettle.show();
        kettle.desc();

        Microwave microwave = new Microwave("Microwave", "Power: 1200W");
        microwave.sound();
        microwave.show();
        microwave.desc();

        Car car = new Car("Car", "Engine: 2.0L, Max speed: 200km/h");
        car.sound();
        car.show();
        car.desc();

        Ship ship = new Ship("Ship", "Capacity: 5000 passengers, Length: 300m");
        ship.sound();
        ship.show();
        ship.desc();
    }
}