package CS_202.W3.InClass_Employee;

// Doug Gilchrist 1/22/20 [Employee Inheritance]
public class EmployeeMain {
    public static void main(String[] args) {
        // Employee
        Employee emp1 = new Employee();
        emp1.setYears(12);
        System.out.println(emp1.getInfo());

        System.out.println();
        // Secretary
        Secretary sec1 = new Secretary(36, 45000, 7, 20);
        System.out.println(sec1.getInfo());
        sec1.setAppointment();

        System.out.println();
        // Legal Secretary
        LegalSecretary legSec1 = new LegalSecretary();
        System.out.println(legSec1.getInfo());
        legSec1.setAppointment();
        legSec1.legalDocuments();

        System.out.println();
        // Lawyer
        Lawyer law1 = new Lawyer();
        law1.setYears(24);
        System.out.println(law1.getInfo());
        law1.sue();

        System.out.println();
        // Trademark Lawyer
        TrademarkLawyer tradeLaw1 = new TrademarkLawyer();
        tradeLaw1.setYears(2);
        System.out.println(tradeLaw1.getInfo());
        tradeLaw1.sue();
        tradeLaw1.trademark();

        System.out.println();
        // Marketer
        Marketer mark1 = new Marketer(32, 47500, 7, 5);
        System.out.println(mark1.getInfo());
        mark1.marketingPlan();
    }
}
