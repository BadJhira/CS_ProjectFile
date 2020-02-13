package CS_202.W5.InClass_Comparable;
// Doug Gilchrist 2/6/20 [Comparable]
import java.util.*;

public class AngleMain {
    public static void main(String[] args) {
        ArrayList<Angle> angle_list = new ArrayList<>();

        angle_list.add(new Angle(240, 5));
        angle_list.add(new Angle(60, 23));
        angle_list.add(new Angle(360, 17));
        angle_list.add(new Angle(120, 23));

        System.out.println("Before sort: ");
        System.out.println(angle_list);

        Collections.sort(angle_list);

        System.out.println("After sort: ");
        System.out.println(angle_list);
    }
}
