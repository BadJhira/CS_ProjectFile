package CS_202.W7.InClass_Collections;

import java.util.*;
import java.io.*;

public class Sets {
    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("Files/Collections/test_text_1");
        Scanner fileScanner = new Scanner(file);
        Set<String> set = new HashSet<>();

        while (fileScanner.hasNext()) {
            set.add(fileScanner.next());
        }

        System.out.println("Set: " + set + "\n");

        System.out.println("Set:");
        readStrings(set);
        System.out.println();

        Set<String> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet: ");
        readStrings(treeSet);
    }

    public static void readStrings(Set<String> set) {
        Iterator<String> iterator = set.iterator();

        System.out.println("Printing strings: ");
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println("String: " + string);
        }

        System.out.println("Done.");
    }
}
