package CS_141.W8.InClass;

import java.util.*;
// 11/12/19 Doug Gilchrist [Weather]
public class Weather {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();

        int[] temps = new int[days];        // array to store days' temperatures
        int sum = tempSum(console, temps, days);
        double average = (double) sum / days;
        int count = countAverage(average, days, temps);
        results(count, average, temps);
        hotCold(temps);
    }

    public static int tempSum(Scanner console, int[] temps, int days) {
        int sum = 0;
        for (int i = 0; i < days; i++) {    // read/store each day's temperature
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        return sum;
    }

    public static int countAverage (double average, int days, int[] temps) {
        int count = 0;                      // see if each day is above average
        for (int i = 0; i < days; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        return count;
    }

    public static void hotCold(int[] temps) {
        Arrays.sort(temps);
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 2] + ", " + temps[temps.length - 1]);
    }

    public static void results(int count, double average, int[] temps) {
        // report results
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days above average");

        System.out.println("Temperatures" + Arrays.toString(temps));
    }
}


