package CS_202.W3.InClass_Employee;
// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class TrademarkLawyer extends Lawyer {
    // properties

    // constructors
    public TrademarkLawyer() { this(40, 60000, 10, 0); }

    public TrademarkLawyer(int hours, int salary, int vacation, int years) {
        super(hours, salary, vacation, years);
    }

    // mutators
    public void trademark() {
        System.out.println(getEmployeeClass() + ": Trademarking.");
    }

    // accessors
    public String getEmployeeClass() { return "Trademark Lawyer"; }

}
