package CS_202.W9.In_Class_SortingAndSearch;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] elements = { -5, -3, 0, 1, 3, 6, 7, 8, 10, 11, 15, 19, 25, 38, 47, 91 };
        int index = intBinarySearch(elements, 42);
        System.out.println("Index of 42: " + index);

        index = intBinarySearch(elements, 19);
        System.out.println("Index of 19: " + index);
    }

    public static int intBinarySearch(int[] array, int target) {
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

    public static int stringBinarySearch(String[] array, String target) {
        int min = 0;
        int max = array.length - 1;

        while(min <= max) {
            int mid = (min + max) / 2;
            if (array[mid].compareTo(target) < 0)
                min = mid + 1;
            else if (array[mid].compareTo(target) > 0)
                max = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
