package CS_202.W1;
// Doug Gilchrist 1/15/2020 [Employee Main]
public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp_1 = new Employee(
                "John", "Smith", 25, 40000, 7, 200);
        Employee emp_2 = new Employee();

        double emp_1_wage = emp_1.getWage();
        System.out.println(emp_1.getFirstName() + "'s wage: " + emp_1_wage);

        emp_2.setFirstName("Joanna");
        emp_2.setLastName("Smith");
        emp_2.setAge(25);
        emp_2.setBaseSalary(25000);
        emp_2.setRate(150);
        emp_2.setOvertime(19);
        emp_2.greet();
    }
}
