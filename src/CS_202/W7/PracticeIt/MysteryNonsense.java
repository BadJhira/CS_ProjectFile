package CS_202.W7.PracticeIt;

import java.util.*;

public class MysteryNonsense {
    public static void main(String[] args) {
//        Map<String, String> map1 = Map.of("two", "deux", "five", "cinq", "one" ,"un", "three", "trois", "four", "quatre");
//        Map<String, String> map2 = Map.of("skate", "board", "drive", "car", "program", "computer", "play", "computer");
//        Map<String, String> map3 = Map.of("siskel", "ebert", "girl", "boy", "heads", "tails", "ready", "begin", "first", "last", "begin", "end");
//        Map<String, String> map4 = Map.of("cotton", "shirt", "tree", "violin", "seed", "tree", "light", "tree", "rain", "cotton");
//
//        mapMystery1(map1);
//        mapMystery1(map2);
//        mapMystery1(map3);
//        mapMystery1(map4);

//        Map<String, String> map1 = Map.of("sheep","wool", "house","brick", "cast","plaster", "wool","wool");
//        Map<String, String> map2 = Map.of("munchkin","blue", "winkie","yellow", "corn","yellow", "grass","green", "emerald","green");
//        Map<String, String> map3 = Map.of("pumpkin","peach", "corn","apple", "apple","apple", "pie","fruit", "peach","peach");
//        Map<String, String> map4 = Map.of("lab","ipl", "lion","cat", "terrier","dog", "cat","cat", "platypus","animal", "nyan","cat");
//
//        mapMystery2(map1);
//        mapMystery2(map2);
//        mapMystery2(map3);
//        mapMystery2(map4);

        // Apparently Map.of() isn't organized, so don't use it for these stupid mystery questions.
    }

    public static void mapMystery1(Map<String, String> map) {
        Map<String, String> result = new TreeMap<>();
        for (String key : map.keySet()) {
            if (key.compareTo(map.get(key)) < 0)
                result.put(key, map.get(key));
            else
                result.put(map.get(key), key);
        }
        System.out.println(result);
    }

    public static void mapMystery2(Map<String, String> map) {
        Set<String> strings = new TreeSet<>();
        for (String key : map.keySet()) {
            if (!map.get(key).equals(key))
                strings.add(map.get(key));
            else
                strings.remove(map.get(key));
        }
        System.out.println(strings);
    }
}
