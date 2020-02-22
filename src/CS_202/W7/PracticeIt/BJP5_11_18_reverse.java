package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_18_reverse {
    public static void main(String[] args) {

    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();
        for (int key : map.keySet()) {
            String string = map.get(key);
            result.put(string, key);
        }
        return result;
    }
}
