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

        System.out.println("=====Set=====");
        printItems(set);
        System.out.println();

        Set<String> treeSet = new TreeSet<>(set);
        System.out.println("=====TreeSet=====");
        printItems(treeSet);
    }

    // <Type> parameters inherit from the Object class by default.
    public static <Type> void printItems(Set<Type> set) {
        Iterator<Type> iterator = set.iterator();
        int n = 0;

        System.out.println("Printing items: ");
        while (iterator.hasNext()) {
            Type item = iterator.next();
            System.out.println("Item " + n + ": " + item);
            n++;
        }

        System.out.println("Done.");
    }
}
