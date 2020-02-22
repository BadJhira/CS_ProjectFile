package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_14_intersect {
    public static void main(String[] args) {

    }

//    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
//        Map<String, Integer> result = new HashMap<>();
//        for (String key1 : map1.keySet()) {
//            int value1 = map1.get(key1);
//
//            for (String key2 : map2.keySet()) {
//                int value2 = map2.get(key2);
//
//                if (key1.equals(key2) && value1 == value2)
//                    result.put(key1, value1);
//            }
//        }
//        return result;
//    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {
            int value = map1.get(key);

            if (map2.containsKey(key) && value == map2.get(key))
                result.put(key, value);
        }
        return result;
    }
}
