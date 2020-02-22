package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_12_contains3 {
    public static void main(String[] args) {

    }

    public static boolean contains3(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            if (map.containsKey(string)) {
                int n = map.get(string) + 1;

                if (n == 3)
                    return true;

                map.put(string, n);
            } else
                map.put(string, 1);
        }
        return false;
    }
}
