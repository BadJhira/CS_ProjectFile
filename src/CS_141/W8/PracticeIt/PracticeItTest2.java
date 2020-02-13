package CS_141.W8.PracticeIt;

import java.util.Arrays;

public class PracticeItTest2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mystery(new int[] {8})));
        System.out.println(Arrays.toString(mystery(new int[] {14, 7})));
        System.out.println(Arrays.toString(mystery(new int[] {7, 1, 3, 2, 0, 4})));
        System.out.println(Arrays.toString(mystery(new int[] {10, 8, 9, 5, 5})));
        System.out.println(Arrays.toString(mystery(new int[] {12, 11, 10, 10, 8, 7})));
    }

    public static int[] mystery(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                array[i + 1]++;
            }
        }
        return array;
    }
}
