package CS_202.W7.InClass_Collections;

import java.util.*;
import java.io.*;

public class Maps {
    public static void main(String[] args)
            throws FileNotFoundException {
        File file = new File("Files/Collections/test_text_1");
        Scanner fileScanner = new Scanner(file);
        Map<Integer, String> map = new HashMap<>();
        int n = 0;

        while (fileScanner.hasNext()) {
            map.put(n, fileScanner.next());
            n++;
        }

        System.out.println(map);
        System.out.println("Keyset: " + map.keySet());
        printMapItems(map);
        System.out.println();

        map.put(6, "random");
        map.put(3, "monster");

        System.out.println(map);
        System.out.println("Keyset: " + map.keySet());
        printMapItems(map);
    }

    // <Type> parameters inherit from the Object class by default.
    public static <Type1, Type2> void printMapItems(Map<Type1, Type2> map) {
//        Iterator<Type1> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            Type1 key = iterator.next();
//            Type2 item = map.get(key);
//            System.out.println("Key: " + key + ", Item: " + item);
//        }
        for (Type1 key : map.keySet()) {
            Type2 item = map.get(key);
            System.out.println("Key: " + key + ", Item: " + item);
        }
    }
}
