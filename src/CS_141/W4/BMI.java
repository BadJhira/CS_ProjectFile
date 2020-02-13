package CS_141.W4;
// Doug Gilchrist 10/17/19 BMI
import java.util.*;

public class BMI {

    public static void main(String[] args) {
        introduction();
        Scanner console = new Scanner(System.in);

        double bmi1 = person(console);
        double bmi2 = person(console);

        report(1, bmi1);
        report(2, bmi2);
        System.out.println("Difference = " + Math.abs(bmi1 - bmi2));
    }

    public static void introduction() {
        System.out.println("This program reads data for two people and");
        System.out.println("computes their body mass index (BMI).");
        System.out.println();
    }

    public static double person(Scanner console) {
        System.out.println("Enter next persons information:");
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();

        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        System.out.println();

        double bodyMass = bmi(height, weight);
        return bodyMass;
    }

    public static double bmi(double height, double weight) {
        return (weight * 703 / height / height);
    }

    public static void report(int number, double bmi) {
        System.out.println("Person " + number + " BMI = " + bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
}
