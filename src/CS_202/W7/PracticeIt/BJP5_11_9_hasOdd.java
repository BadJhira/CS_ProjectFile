package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_9_hasOdd {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(4);
        set.add(6);
        set.add(7);
        set.add(8);

        System.out.println(hasOdd(set));
    }

    public static boolean hasOdd(Set<Integer> set) {
        for (int n : set) {
            if (n % 2 != 0)
                return true;
        }
        return false;
    }
}
