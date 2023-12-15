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
        this.dollars = Math.max(dollars, 0);
    }

    public void setCents(int cents) {
        if (cents > 99) {
            int n1 = cents % 100;
            this.cents = n1;
            n1 = cents / 100;
            this.dollars += n1;
        } else this.cents = Math.max(cents, 0);
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public void displayAmount() {
        System.out.printf("%d.%02d%n", dollars, cents);
    }
}
