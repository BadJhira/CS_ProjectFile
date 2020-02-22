package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_3_removeInRange {
    public static void main(String[] args) {

    }

    public static void removeInRange(List<Integer> list, int value, int start, int end) {
        // Use a for loop from the start to end values, but iterate backwards.
        // Iterating backwards avoids the 'leapfrogging'
        // issue of removing items from the list.
        for (int i = end - 1; i >= start; i--) {
            if (list.get(i) == value)
                list.remove(i);
        }
    }
}
