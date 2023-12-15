import Ex4_Classes.Device;
import Ex4_Classes.Kettle;
import Ex4_Classes.Microwave;
import Ex4_Classes.Car;
import Ex4_Classes.Ship;

public class Ex4 {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("Xiaomi", "GM-34", "1500v", "1.7L");
        kettle.show();
        kettle.sound();
        kettle.desc();

        Microwave microwave = new Microwave("Philips", "Cli-23", "30.l", "1200v");
        microwave.show();
        microwave.sound();
        microwave.desc();

        Car car = new Car("Audi", "Audi R8", "Суперкар", 2010, "4.2 FSI V8");
        car.show();
        car.sound();
        car.desc();

        Ship ship = new Ship("Пароход", "Katerina", 280);
        ship.show();
        ship.sound();
        ship.desc();
    }
}