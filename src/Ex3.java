import Ex3_Classes.Money;
import Ex3_Classes.Product;

public class Ex3 {
    public static void main(String[] args) {
        Product product = new Product("Яблоко", 3, 30);
        product.displayProductInfo();

        product.increasePrice(2.80);
        product.displayProductInfo();
        
        product.decreasePrice(4.875);
        product.displayProductInfo();
    }
}