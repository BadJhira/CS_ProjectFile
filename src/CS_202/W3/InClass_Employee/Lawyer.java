package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class Lawyer extends Employee {
    // properties

    // constructors
    public Lawyer() { this(40, 55000, 10, 0); }

    public Lawyer(int hours, int salary, int vacation, int years) {
        super(hours, salary, vacation, years);
    }

    // mutators
    public void sue() {
        System.out.println(getEmployeeClass() + ": Suing.");
    }

    // accessors
    public String getVacationForm() { return "Pink"; }

    public String getEmployeeClass() { return "Lawyer"; }

}
