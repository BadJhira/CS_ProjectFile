package CS_202.W5.InClass_ArrayList;

import java.util.*;

public class ArrayList_Removal {
    public static void main(String[] args) {
        ArrayList<String> list_1 = new ArrayList<>();

        list_1.add("a");
        list_1.add("b");
        list_1.add("c");
        list_1.add("a");
        list_1.add("b");
        list_1.add("c");
        list_1.add("a");
        list_1.add("b");
        list_1.add("c");

        System.out.println(list_1);
        removeAll(list_1, "a");
        System.out.println(list_1);
    }

    public static void removeAll(ArrayList<String> list, String target) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(target))
                list.remove(i);
        }
    }
}
