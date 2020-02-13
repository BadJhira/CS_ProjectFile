package CS_141.W9.InClass;

import java.util.Arrays;
// 11/19/19 Doug Gilchrist [Every 5 Tally]
public class EveryFifthTally {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] array2 = sumFifths(array1);

        System.out.println(Arrays.toString(array2));
    }

    public static int[] sumFifths(int[] array) {
        int[] sums = new int[5];
        for (int i = 0; i < array.length; i++)
            sums[i % 5] += array[i];
        return sums;
    }
}
