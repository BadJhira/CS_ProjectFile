package CS_202.W7.InClass_Collections;
// Doug Gilchrist 2/19/20 [Linked Lists]
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
        // that pass in a list, so the iterator is always pointing to the correct list.

        System.out.println(linkedList + "\n");
        printItems(linkedList);

        System.out.println();
        removeFirstItems(linkedList);
    }

    // Building this method as generic so it could theoretically pass in any type of linked list.
    // <Type> parameters inherit from the Object class by default.
    public static <Type> void printItems(LinkedList<Type> list) {
        Iterator<Type> iterator = list.iterator();
        int n = 0;

        System.out.println("Printing items: ");
        while (iterator.hasNext()) {
            Type item = iterator.next();
            System.out.println("Item " + n + ": " + item);
            n++;
        }

        System.out.println("Done.");
    }

    public static <Type> void removeFirstItems(LinkedList<Type> list) {
        Iterator<Type> iterator = list.iterator();

        System.out.println("Removing items: ");
//        while (!list.isEmpty()) {
//            list.remove(0);
//            System.out.println("Remove first string: " + list);
//        }
        while (iterator.hasNext()) {
            System.out.println(list);
            Type item = iterator.next();
            System.out.println("Removing item: " + item);
            iterator.remove();
        }

        System.out.println("Done. " + list);
    }
}
