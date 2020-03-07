package CS_202.W9.In_Class_SortingAndSearch;
// Doug Gilchrist 3/4/20 [Queues]
import java.io.*;
import java.util.*;

public class QueueExample {
    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("Files/Collections/stack_students");
        Scanner fileScanner = new Scanner(file);

        Queue<String> queue = new LinkedList<>();
        while (fileScanner.hasNext()) {
            queue.add(fileScanner.nextLine());
        }

        Stack<String> stack = new Stack<>();

        System.out.println("Queue: " + queue);
        System.out.println("Queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue peek: " + queue.peek() + "\n");

        System.out.println("===== Polling from Queue, Pushing to Stack =====");
        while (!queue.isEmpty()) {
            String string = queue.poll();
            System.out.println("Poll + Push: " + string);
            stack.push(string);
        }
        System.out.println();

        System.out.println("Queue: " + queue);
        System.out.println("Queue empty? " + queue.isEmpty() + "\n");

        System.out.println("===== Popping from Stack =====");
        while(!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}
