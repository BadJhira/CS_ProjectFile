package CS_202.W7.PracticeIt;

import java.util.*;

public class BJP5_11_2_alternate {
    public static void main(String[] args) {

    }

    public static LinkedList<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();
        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        while (iterator1.hasNext() || iterator2.hasNext()) {
            if (iterator1.hasNext())
                result.add(iterator1.next());
            if (iterator2.hasNext())
                result.add(iterator2.next());
        }

        return result;
    }
}
