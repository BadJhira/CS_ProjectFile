package CS_141.W8.InClass;

import java.util.Arrays;
// 11/14/19 Doug Gilchrist [Variable Stutter]
public class ArrayStutter {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = stutter(array1, 4);

        System.out.println("Before Stutter: " + Arrays.toString(array1));
        System.out.println("After Stutter: " + Arrays.toString(array2));
    }

    public static int[] stutter(int[] array, int numDupes) {
        int[] result = new int[(array.length * numDupes)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < numDupes; j++) {
                result[(numDupes * i) + j] = array[i];
            }
        }
        return result;
    }
}
