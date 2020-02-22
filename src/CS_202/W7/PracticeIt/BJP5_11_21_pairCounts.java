package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_21_pairCounts {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> pairCounts(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            while (string.length() > 1) {
                String sub = string.substring(0, 2);
                if (map.containsKey(sub)) {
                    int temp = map.get(sub) + 1;
                    map.put(sub, temp);
                } else
                    map.put(sub, 1);
                string = string.substring(1);
            }
        }

        return map;
    }
}
