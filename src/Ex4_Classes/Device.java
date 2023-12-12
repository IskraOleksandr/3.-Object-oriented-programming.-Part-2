package Ex4_Classes;

public class Device {
    private String name;
    private String characteristics;

    public Device(String name, String characteristics) {
        this.name = name;
        this.characteristics = characteristics;
    }

    public void sound() {
        System.out.println("Beep beep");
    }

    public void show() {
        System.out.println("Device: " + name);
    }

    public void desc() {
        System.out.println("Characteristics: " + characteristics);
    }
}