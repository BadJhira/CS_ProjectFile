package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_19_rarest {
    public static void main(String[] args) {

    }

//    public static int rarest(Map<String, Integer> map) {
//        if (map.isEmpty())
//            throw new IllegalArgumentException();
//
//        Map<Integer, Integer> ages = new HashMap<>();
//
//        for (int value : map.values()) {
//            if (ages.containsKey(value)) {
//                int n = ages.get(value) + 1;
//                ages.put(value, n);
//            } else {
//                ages.put(value, 1);
//            }
//        }
//
//        Iterator<Integer> iterator = ages.keySet().iterator();
//        int minAge = iterator.next();
//
//        while (iterator.hasNext()) {
//            int nextAge = iterator.next();
//            if (ages.get(nextAge) < ages.get(minAge)) {
//                minAge = nextAge;
//            } else if (ages.get(nextAge).equals(ages.get(minAge)) && nextAge < minAge) {
//                    minAge = nextAge;
//            }
//        }
//
//        return minAge;
//    }

    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty())
            throw new IllegalArgumentException();

        Map<Integer, Integer> ages = new TreeMap<>();

        for (int value : map.values()) {
            if (ages.containsKey(value)) {
                int n = ages.get(value) + 1;
                ages.put(value, n);
            } else {
                ages.put(value, 1);
            }
        }

        Iterator<Integer> iterator = ages.keySet().iterator();
        int minAge = iterator.next();

        while (iterator.hasNext()) {
            int nextAge = iterator.next();
            if (ages.get(nextAge) < ages.get(minAge)) {
                minAge = nextAge;
            }
        }

        return minAge;
    }
}
