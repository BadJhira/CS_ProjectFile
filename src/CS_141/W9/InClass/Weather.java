package CS_141.W9.InClass;

import java.io.*;
import java.util.*;
// 11/21/2019 Doug Gilchrist [Weather]
public class Weather {
    public static void main(String[] args) throws FileNotFoundException {
        weatherChange();
        System.out.println();
        weatherChange2();
    }

    public static void weatherChange() throws FileNotFoundException {
        // setting up the Scanner to read from file
        Scanner weatherInput = new Scanner(new File("Files\\weather"));
        // setting up the PrintStream to print to another file
        PrintStream weatherOutput = new PrintStream(new File("Files\\weather_change.txt"));
        double previous = weatherInput.nextDouble();
        // while loop checks for doubles, but doesn't account for other tokens (stops when it hits a non-double)
        while (weatherInput.hasNextDouble()) {
            double current = weatherInput.nextDouble();
            double change = Math.round((current - previous) * 10) / 10.0;

            System.out.println(previous + " to " + current + ", change = " + change);
            // print to another file with PrintStream
            weatherOutput.println(previous + " to " + current + ", change = " + change);

            previous = current;
        }
    }

    public static void weatherChange2() throws FileNotFoundException {
        // setting up the Scanner to read from file
        Scanner weatherInput = new Scanner(new File("Files\\weather_2"));
        // setting up the PrintStream to print to another file
        PrintStream weatherOutput = new PrintStream(new File("Files\\weather_change_2.txt"));
        double previous = weatherInput.nextDouble();
        while (weatherInput.hasNext()) {
            if (weatherInput.hasNextDouble()) { // only work with tokens that are doubles
                double current = weatherInput.nextDouble();
                double change = Math.round((current - previous) * 10) / 10.0;

                System.out.println(previous + " to " + current + ", change = " + change);
                // print to another file with PrintStream
                weatherOutput.println(previous + " to " + current + ", change = " + change);

                previous = current;
            } else {
                weatherInput.next(); // toss unwanted token
            }
        }
    }
}
