package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_13_isUnique {
    public static void main(String[] args) {

    }

    public static boolean isUnique(Map<String, String> map) {
        // Build a set from the map values. Sets can only
        // contain unique values.
        Set<String> set = new HashSet<>(map.values());
        // Compare map size to the set size.
        // If the map contains only unique values, it will
        // be the same size as the set.
        return map.size() == set.size();
    }
}
