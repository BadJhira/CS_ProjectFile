package CS_141.W11.InClass;
// Doug Gilchrist 12/3/19 [Classes & Objects]
public class EmployeeMain {
    public static void main(String[] args) {
        Employee worker1 = new Employee("John", "Doe");
        Employee worker2 = new Employee("Mary", "Jane",
                45000, 7.5, 10);

        worker1.baseSalary = 35000;
        worker1.overtime = 10;
        worker1.rate = 10;

        System.out.println("Employee name: " + worker1.getName());
        System.out.println("Employee wage: " + worker1.getWage());
        System.out.println();
        System.out.println("Employee name: " + worker2.getName());
        System.out.println("Employee wage: " + worker2.getWage());
    }
}
