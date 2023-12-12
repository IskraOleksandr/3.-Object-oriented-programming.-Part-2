package Ex3_Classes;

public class Money {
    private int dollars;
    private int cents;

    public Money() {
        dollars = 0;
        cents = 0;
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void displayAmount() {
        System.out.println(dollars + "." + cents);
    }
}
