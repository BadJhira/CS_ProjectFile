package CS_141.W3.BJPTextbookExercises;
// Doug Gilchrist 10/16/19 BJPTextbookExercises - Week 3 - Programming Project 2
public class Project2 {
    public static void main(String[] args) {
        System.out.println("Doug Gilchrist - Week 3");
        System.out.println(" Programming Project 2");
        System.out.println("=======================");
        System.out.println();

        table(1000.00, 100.00, 6.5, 1, 25);
    }

    public static void table(double principal, double yearlyDeposit, double interestRate, int timesPerYear, int totalYears) {
        System.out.println("Year \tBalance \tRate \tInterest \tDeposit \tNew Balance");
        double balance = principal;
        double interest;
        double deposit = 0.0;
        double newBalance;
        for (int line = 1; line <= totalYears; line++) {
            interest = sigFigs2(calcInterest(principal, interestRate, timesPerYear, line) - principal);
            newBalance = sigFigs2(balance + interest + deposit);
            System.out.println(line + " \t\t" + "$" + balance + " \t" + interestRate + "% \t" +
                                "$" + interest + "   \t" + "$" + deposit + " \t\t" + "$" + newBalance);
            deposit = yearlyDeposit;
            balance = newBalance;
        }
    }

    public static double sigFigs2(double num) {
        return (Math.round(num * 100.0) / 100.0);
    }

    public static double percentToDecimal(double percent) {
        return (percent / 100);
    }

    public static double calcInterest(double principal, double interestRate, int timesPerYear, int numYears) {
        double rate = 1 + (percentToDecimal(interestRate) / timesPerYear);
        double exponent = timesPerYear * numYears;
        return principal * Math.pow(rate, exponent);
    }
}
