package Ex4_Classes;

public abstract class Device {
    protected String name;

    public Device(String name) {
        this.name = name;
    }

    public abstract void sound();

    public abstract void show();

    public abstract void desc();
}