package CS_202.W9.In_Class_SortingAndSearch;
// Doug Gilchrist 3/2/20 [Arrays, Big O]
import java.util.*;

public class ArraysClass {
    public static void main(String[] args) {
        int[] elements = { -5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 17, 19, 21, 22, 25, 27, 34, 36, 38, 47, 91 };
        int[] copyOf = Arrays.copyOf(elements, 10);
        int[] messyArray = { 42, -5, 14, 0, 3, 9, 7, -23, 56, 47 };

        System.out.println("copyOf: " + Arrays.toString(copyOf));

        int index = nonRecursiveBinarySearch(copyOf, 7);
        System.out.println("copyOf Index of 7: " + index);
        index = nonRecursiveBinarySearch(copyOf, 5);
        System.out.println("copyOf Index of 5: " + index);
        System.out.println();

        System.out.println("Unsorted messyArray: " + Arrays.toString(messyArray));
        Arrays.sort(messyArray);
        System.out.println("Sorted messyArray: " + Arrays.toString(messyArray));

        index = recursiveBinarySearch(messyArray, 3);
        System.out.println("messyArray Index of 3: " + index);
        index = recursiveBinarySearch(messyArray, 6);
        System.out.println("messyArray Index of 6: " + index);
        System.out.println();

        System.out.println(Arrays.toString(elements));
        int elementsRange = range(elements);
        System.out.println("O(N) Range of elements: " + elementsRange);
        elementsRange = badRange(elements);
        System.out.println("O(N^2) Range of elements: " + elementsRange);
        // Array size isn't really large enough to produce a noticeable difference.
        // Likely wont have a noticeable difference until array size reaches 1000+ elements.
    }

    public static int recursiveBinarySearch(int[] array, int target) {
        return recursiveBinarySearch(array, target, 0, array.length - 1, (array.length - 1) / 2);
    }

    private static int recursiveBinarySearch(int[] array, int target, int min, int max, int mid) {
        if (min > max)
            return -1;
        else if (array[mid] < target)
            return recursiveBinarySearch(array, target, mid + 1, max, (mid + 1 + max) / 2);
        else if (array[mid] > target)
            return recursiveBinarySearch(array, target, min, mid - 1, (mid - 1 + min) / 2);
        else
            return mid;
    }

    public static int nonRecursiveBinarySearch(int[] array, int target) {
        int min = 0;
        int max = array.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] < target)
                min = mid + 1;
            else if (array[mid] > target)
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public static int range(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
            else if (array[i] > max)
                max = array[i];
        }
        return max - min;
    }

    public static int badRange(int[] array) {
        int diff = 0;

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = Math.abs(array[i] - array[j]);
                if (temp > diff)
                    diff = temp;
            }
        }
        return diff;
    }
}
