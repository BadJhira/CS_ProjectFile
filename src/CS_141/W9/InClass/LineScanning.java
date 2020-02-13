package CS_141.W9.InClass;

import java.io.*;
import java.util.*;
// 11/21/2019 Doug Gilchrist [Line Scanning]
public class LineScanning {
    public static void main(String[] args) throws FileNotFoundException {
        hoursWorked(new File("Files\\hours_1"));
    }

    public static void hoursWorked(File file) throws FileNotFoundException {
        Scanner fileInput = new Scanner(file);
        do {
            int id;
            String name;
            double hours = 0.0;

            if (fileInput.hasNext()) {
                Scanner line = new Scanner(fileInput.nextLine());

                id = line.nextInt();
                name = line.next();
                int days = 0;
                double average = 0.0;

                while (line.hasNextDouble()) {
                    hours += line.nextDouble();
                    days++;
                }

                if (days > 0)
                    average = hours / days;

                System.out.printf(name + "(ID#" + id + ") worked %.1f (%.2f hours/day)\n", hours, average);
            }
        } while (fileInput.hasNext());
    }
}
