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

        for (int key: map.keySet()) {
            System.out.println("Key: " + key + ", " + "String: " + map.get(key));
        }
    }
}
