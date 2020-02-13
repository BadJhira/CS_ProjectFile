package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class LegalSecretary extends Secretary {
    // properties

    // constructors
    public LegalSecretary() { this(26, 45000, 7, 0); }

    public LegalSecretary(int hours, int salary, int vacation, int years) {
        super(hours, salary, vacation, years);
    }

    // mutators
    public void legalDocuments() {
        System.out.println(getEmployeeClass() + ": Filing legal documents.");
    }

    // accessors
    public String getEmployeeClass() { return "Legal Secretary"; }
}
