package CS_141.W7.InClass;

import java.util.Random;
// 11/7/19 Doug Gilchrist
public class BooleanStuff7 {
    public static void main(String[] args) {
        Random rand = new Random();

        String string = (seven(rand)) ? "Lucky 7!" : "No luck!";
        System.out.println(string);
    }

    public static boolean seven(Random rand) {
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(30) + 1;
            System.out.println("Roll #" + i + ":\t" + num);
            if (num == 7) {
                return true;
            }
        }
        return false;
    }
}
