package CS_141.W9.InClass;

import java.util.Arrays;
// 11/19/19 Doug Gilchrist [Removing Zeroes]
public class ArrayRemoveZeroes {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 2, 0, 3, 0, 4, 0, 5, 0};

        removeZeroes(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void removeZeroes(int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[j] = array[i];
                j++;
            }
        }
        for (int i = j; i < array.length; i++) {
            array[i] = 0;
        }
    }
}
