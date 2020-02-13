package CS_141.W9.InClass;

import java.util.Arrays;
// 11/19/19 Doug Gilchrist [Tallies]
public class ArrayOfTallies {
    public static void main(String[] args) {
        int[] counts = tally(120561390);
        System.out.println(Arrays.toString(counts));
    }

    public static int[] tally(int n) {
        int[] counts = new int[10];
        while (n > 0) {
            int digit = n % 10;
            counts[digit]++;
            n = n / 10;
        }
        return counts;
    }
}
