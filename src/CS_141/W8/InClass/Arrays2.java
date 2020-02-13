package CS_141.W8.InClass;

import java.util.Arrays;
// 11/14/19 Doug Gilchrist [Reversal / Reference]
public class Arrays2 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10};

        System.out.println("Before Reversal: " + Arrays.toString(array1));
        arrayReversal(array1);
        System.out.println("After Reversal: " + Arrays.toString(array1));

        double average = average(array1);
        System.out.println("Average: " + average);

        int[] array2 = stutter(array1);
        System.out.println("Stutter: " + Arrays.toString(array2));

        // prints the same address in both cases - array1 and arrayRef point to the same references
        int[] arrayRef = array1;
        System.out.println("Reference semantics: " + array1 + " = " + arrayRef);
    }

    public static void arrayReversal(int[] array) {
        for (int i = 0; i < (array.length / 2); i++) {
            // reverses the order of array elements utilizing an intermediate storage variable (temp)
            int temp = array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i];
            array[i] = temp;
        }
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return ((double)sum / array.length);
    }

    public static int[] stutter(int[] array) {
        // returns an array! can be used to make NEW arrays! :D
        int[] result = new int[(array.length * 2)];
        for (int i = 0; i < array.length; i++) {
            // in this case, returns an array twice as long with duplicated array elements
            result[(2 * i)]     = array[i];
            result[(2 * i) + 1] = array[i];
        }
        return result;
    }
}
