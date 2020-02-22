package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_6_countUnique {
    public static void main(String[] args) {

    }

    public static int countUnique(List<Integer> list) {
        // Instantiate a set using the list.
        Set<Integer> set = new HashSet<>(list);
        // A set cannot contain non-unique values, so just
        // return the set size (i.e. the quantity of unique values).
        return set.size();
    }
}
