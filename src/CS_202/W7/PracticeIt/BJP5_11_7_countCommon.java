package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_7_countCommon {
    public static void main(String[] args) {

    }

//    public static int countCommon(List<Integer> list1, List<Integer> list2) {
//        Set<Integer> set1 = new HashSet<>(list1);
//        int count = 0;
//
//        for (int n1 : set1) {
//            if (list2.contains(n1))
//                count++;
//        }
//
//        return count;
//    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        set1.retainAll(set2);
        return set1.size();
    }
}
