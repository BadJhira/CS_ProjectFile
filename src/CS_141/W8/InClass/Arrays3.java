package CS_141.W8.InClass;

import java.util.Arrays;
// 11/14/19 Doug Gilchrist [Traversal]
public class Arrays3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] array2 = new int[0];
        int[] array3 = {92};
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array5 = {7, 7, 7, 7, 7, 7, 7, 7, 7};

        System.out.println(Arrays.toString(array1));
        System.out.println("Unique numbers: " + numUnique(array1));

        System.out.println(Arrays.toString(array2));
        System.out.println("Unique numbers: " + numUnique(array2));

        System.out.println(Arrays.toString(array3));
        System.out.println("Unique numbers: " + numUnique(array3));

        System.out.println(Arrays.toString(array4));
        System.out.println("Unique numbers: " + numUnique(array4));

        System.out.println(Arrays.toString(array5));
        System.out.println("Unique numbers: " + numUnique(array5));
    }

    public static int numUnique(int[] array) {
        int count = 0;
        if (array.length > 0) {
            count = 1;
            for (int i = 1; i < array.length; i++) {
                if (array[i] != array[i-1]) {
                    count++;
                }
            }
        }
        return count;
    }
}
