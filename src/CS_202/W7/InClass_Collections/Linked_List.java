package CS_202.W7.InClass_Collections;

import java.util.*;
import java.io.*;

public class Linked_List {
    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("Files/Collections/test_text_1");
        Scanner fileScanner = new Scanner(file);
        LinkedList<String> linkedList = new LinkedList<>();

        while (fileScanner.hasNext()) {
            linkedList.add(fileScanner.next());
        }

        // Iterator<String> iterator = linkedList.iterator();
        // Iterator MUST be declared after the list is manipulated / constructed.
        // This implies to me that iterators are best declared within methods
        // that pass in a list, so the iterators is always pointing to the correct list.

        System.out.println(linkedList + "\n");
        readStrings(linkedList);
        System.out.println();
        removeFirstStrings(linkedList);
    }

    public static void readStrings(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();

        System.out.println("Printing strings: ");
        while (iterator.hasNext()) {
            String string = iterator.next();
            System.out.println("String: " + string);
        }

        System.out.println("Done.");
    }

    public static void removeFirstStrings(LinkedList<String> list) {
        Iterator<String> iterator = list.iterator();

        System.out.println("Removing strings: ");
//        while (!list.isEmpty()) {
//            list.remove(0);
//            System.out.println("Remove first string: " + list);
//        }
        while (iterator.hasNext()) {
            System.out.println(list);
            String string = iterator.next();
            System.out.println("Current word: " + string);
            iterator.remove();
        }

        System.out.println("Done. " + list);
    }
}
