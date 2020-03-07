package CS_202.W9.In_Class_SortingAndSearch;
// Doug Gilchrist 3/4/20 [Stacks]
import java.io.*;
import java.util.*;

public class StackExample {
    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("Files/Collections/stack_students");
        Scanner fileScanner = new Scanner(file);

        Stack<String> stack = new Stack<>();
        while (fileScanner.hasNext()) {
            stack.push(fileScanner.nextLine());
        }

        System.out.println("Stack: " + stack);
        System.out.println("Stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek() + "\n");

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
        System.out.println();

        System.out.println("Stack: " + stack);
        System.out.println("Stack empty? " + stack.isEmpty() + "\n");
    }
}
