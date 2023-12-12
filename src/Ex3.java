import Ex3_Classes.Money;
import Ex3_Classes.Product;

public class Ex3 {
    public static void main(String[] args) {

        Money money = new Money(10, 50);
        money.displayAmount();

        Product product = new Product("Apple", 2, 75);
        product.displayProductInfo();

        product.decreasePrice(50);
        product.displayProductInfo();
    }
}