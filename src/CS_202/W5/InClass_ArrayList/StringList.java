package CS_202.W5.InClass_ArrayList;

import java.util.*;

public class StringList {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("(" + i +") Enter a string: ");
            list1.add(console.nextLine());
        }

        System.out.println("Array List: ");
        System.out.println(list1.toString());

        list1.add(0, "Invader!");
        System.out.println("Array List: ");
        System.out.println(list1.toString());

        list1.add(2, "Rat!");
        System.out.println("Array List: ");
        System.out.println(list1.toString());

        list1.remove(1);
        list1.remove(2);
        System.out.println("Array List: ");
        System.out.println(list1.toString());
    }
}
