package Ex5_Classes;

public class Trombone extends MusicalInstrument {
    public Trombone(String name, String size) {
        super.name = name;
        super.instrumensize = size;
    }

    @Override
    public void show() {
        System.out.println(name + "\nPазмер: " + instrumensize);
    }

    @Override
    public void sound() {
        System.out.println("\tИздает звук, получающийся от колебания полного столба воздуха в инструменте.\n\tОсновной тон называется педальным звуком.");
    }

    @Override
    public void desc() {
        System.out.println("\tОписание:\n\tМедный духовой музыкальный инструмент, отличительной особенностью которого\n\tявляется наличие передвижной кулисы, вместо обычно используемых вентилей");
    }

    @Override
    public void history() {
        System.out.println("Появление тромбона относится к XV веку.\nПринято считать, что непосредственными предшественниками этого инструмента были кулисные трубы");
    }
}