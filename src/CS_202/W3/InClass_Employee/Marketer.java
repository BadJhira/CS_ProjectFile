package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class Marketer extends Employee {
    // properties

    // constructors
    public Marketer() { this(36, 50000, 7, 0); }

    public Marketer(int hours, int salary, int vacation, int years) {
        super(hours, salary, vacation, years);
    }

    // mutators
    public void marketingPlan() {
        System.out.println(getEmployeeClass() + ": Developing marketing plan.");
    }

    // accessors
    public String getEmployeeClass() { return "Marketer"; }
}
