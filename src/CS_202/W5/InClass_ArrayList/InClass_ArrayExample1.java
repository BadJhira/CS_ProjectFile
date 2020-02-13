package CS_202.W5.InClass_ArrayList;

import java.util.*;

public class InClass_ArrayExample1 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("banana");
        stringArrayList.add("Skaven");
        stringArrayList.add("Rat Pack");
        stringArrayList.add("utter contempt");
        stringArrayList.add("a bit tired");

        int sum = 0;

        // regular for loop
        for (int i = 0; i < stringArrayList.size(); i++) {
            String string = stringArrayList.get(i);
            sum += string.length();
        }

        System.out.println(sum);

        // foreach loop
        for (String string: stringArrayList) {
            System.out.println(string);
        }
    }
}
