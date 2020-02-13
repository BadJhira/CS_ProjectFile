package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class Employee {
    // properties
    String firstName;
    String lastName;
    double baseSalary;
    double overtime;
    double rate;

    // constructors
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  Employee(String firstName, String lastName, double baseSalary, double overtime, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.overtime = overtime;
        this.rate = rate;
    }

    // methods
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public double getWage() {
        return this.baseSalary + (this.overtime * this.rate);
    }
}
