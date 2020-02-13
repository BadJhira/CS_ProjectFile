package CS_202.W2.InClass;
// Doug Gilchrist 1/15/2020
public class BankMain {
    public static void main(String[] args) {
        Bank balance_1 = new Bank();

        balance_1.increaseBalance(14000.00);
        System.out.printf("Balance: %.2f\n", balance_1.getBalance());

        balance_1.decreaseBalance(5.25);
        balance_1.printBalance();

        balance_1.decreaseBalance(350.25);
        balance_1.printBalance();

        balance_1.increaseBalance(7500.25);
        balance_1.printBalance();
    }
}
