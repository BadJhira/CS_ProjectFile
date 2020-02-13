package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class Secretary extends Employee {
    // properties

    // constructors
    public Secretary() { this(26, 45000, 7, 0); }

    public Secretary(int hours, int salary, int vacation, int years) {
        super(hours, salary, vacation, years);
    }

    // mutators
    public void setAppointment() {
        System.out.println(getEmployeeClass() + ": Setting appointment.");
    }

    // accessors
    public String getEmployeeClass() { return "Secretary"; }

}
