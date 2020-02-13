package CS_202.W1;
// Doug Gilchrist 1/15/2020 [Employee Class]
public class Employee {
    // properties
    private String firstName, lastName;
    private int age, baseSalary, overtime, rate;

    // constructors
    public Employee(String firstName, String lastName, int age, int baseSalary, int overtime, int rate) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setBaseSalary(baseSalary);
        setOvertime(overtime);
        setRate(rate);
    }

    public Employee() {
        this("no_first", "no_last", 0, 0, 0, 100);
    }

    // mutators
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setAge (int age) { this.age = age; }

    public void setBaseSalary (int baseSalary) {
        if (baseSalary > 100000)
            throw new IllegalArgumentException("Base Salary cannot exceed 100000: " + baseSalary);
        this.baseSalary = baseSalary;
    }

    public void setOvertime (int overtime) {
        if (overtime > 20)
            throw new IllegalArgumentException("Overtime cannot exceed 20 hours: " + overtime);
        this.overtime = overtime;
    }

    public void setRate(int rate) {
        if (rate < 100)
            throw new IllegalArgumentException("Overtime rate cannot be below $100: " + rate);
        this.rate = rate;
    }

    //accessors
    public String getFirstName() { return this.firstName; }

    public String getLastName() { return this.lastName; }

    public int getAge() { return age; }

    public int getBaseSalary() { return baseSalary; }

    public int getOvertime() { return overtime; }

    public int getRate() { return rate; }

    public double getWage() {
        return getBaseSalary() + (getOvertime() * getRate());
    }

    public void greet() {
        System.out.println("Good morning, my name is " + getFirstName() + " " + getLastName() + ".");
    }

}
