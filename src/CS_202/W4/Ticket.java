package CS_202.W4;

public abstract class Ticket {
    // properties
    private int number;

    // constructors
    public Ticket(int number) {
        setNumber(number);
    }

    // mutators
    public void setNumber(int number) { this.number = number; }

    // accessors
    public int getNumber() { return number; }

    public String toString() {
        return "Number: " + getNumber() + ", Price: " + getPrice();
    }

    public abstract double getPrice();
}

