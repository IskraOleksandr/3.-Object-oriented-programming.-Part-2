package Ex3_Classes;

public class Product {
    private String name;
    private Money price;

    public Product(String name, int dollars, int cents) {
        this.name = name;
        this.price = new Money(dollars, cents);
    }

    public void decreasePrice(int amount) {
        int newCents = price.getCents() - amount;
        if (newCents < 0) {
            price.setDollars(price.getDollars() - 1);
            newCents += 100;
        }
        price.setCents(newCents);
    }

    public void displayProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.print("Price: ");
        price.displayAmount();
    }
}