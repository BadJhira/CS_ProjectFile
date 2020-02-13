package CS_141.W4;
// Doug Gilchrist 10/17/19 Bonus
import java.util.*;

public class Bonus {
    public static int BONUS_OR_TAX = 10;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How much money did you earn? ");
        int money = console.nextInt();

        if (money > BONUS_OR_TAX) {
            money -= BONUS_OR_TAX;
            System.out.println("You were taxed $" + BONUS_OR_TAX);
        } else if (money < BONUS_OR_TAX) {
            money += BONUS_OR_TAX;
            System.out.println("You were given a bonus of $" + BONUS_OR_TAX);
        } else {
            System.out.println("You were not taxed or given a bonus.");
        }
        System.out.println("Final money: $" +money);
    }
}
