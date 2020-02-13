package CS_202.W2.InClass;
// Doug Gilchrist 1/15/2020
public class Bank {
    // properties
    private double balance;

    // constructors
    public Bank(double balance) {
        this.balance = balance;
    }

    public Bank() {
        this(0.0);
    }

    // mutators
    public void increaseBalance(double value) {
        if (value < 0)
            throw new IllegalArgumentException("Cannot deposit a negative value: " + value);
        balance += value;
    }

    public void decreaseBalance(double value) {
        if (value < 0 || value > balance)
            throw new IllegalArgumentException(
                    "Cannot withdraw a negative value or value larger than balance: " + value);
        balance -= value;
    }

    //accessors
    public double getBalance() { return balance; }

    public String balanceToString() { return String.format("%.2f", getBalance()); }

    public void printBalance() { System.out.println("Balance: " + balanceToString()); }
}
