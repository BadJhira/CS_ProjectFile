package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_15_maxOccurrences {
    public static void main(String[] args) {

    }

    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int n : list) {
            if (map.containsKey(n)) {
                int temp = map.get(n) + 1;

                if (max < temp)
                    max = temp;

                map.put(n, temp);
            } else
                map.put(n, 1);
        }

        return max;
    }
}
