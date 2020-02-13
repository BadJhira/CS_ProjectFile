package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class Employee {
    // properties
    private int hours, salary, vacation, years;

    // constructors
    public Employee() { this(40, 40000, 7, 0); }

    public Employee(int hours, int salary, int vacation, int years) {
        setHours(hours);
        setSalary(salary);
        setVacation(vacation);
        setYears(years);
    }

    // mutators
    public void setHours(int hours) { this.hours = hours; }

    public void setSalary(int salary) { this.salary = salary; }

    public void setVacation(int vacation) { this.vacation = vacation; }

    public void setYears(int years) { this.years = years; }

    // accessors
    public int getHours() { return hours; }

    public int getSalary() { return salary; }

    public int getVacation() { return vacation + (2 * getYears()); }

    public int getYears() { return years; }

    public String getVacationForm() { return "Yellow"; }

    public String getEmployeeClass() { return "Employee"; }

    public String getInfo() {
        return "---" + getEmployeeClass() + " Info--- \n"
                + "Hours: " + getHours() + "\n"
                + "Salary: " + getSalary() + "\n"
                + "Vacation: " + getVacation() + "\n"
                + "Vacation form: " + getVacationForm() + "\n"
                + "Years: " + getYears();
    }
}
