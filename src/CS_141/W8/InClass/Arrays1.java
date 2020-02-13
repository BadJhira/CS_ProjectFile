package CS_141.W8.InClass;

import java.util.Arrays;
// 11/12/19 Doug Gilchrist [Arrays]
public class Arrays1 {
    public static void main(String[] args) {
        // datatype[] name = new datatype[ length of array ];
        // OR datatype[] name = {data, data, data, ...};
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        // numbers[10] = #;  causes an error because numbers[10] is outside the array range
        int[] numbers2 = {1, 2, 3, 4, 12, 32};
        int[] numbers3 = {5, 6, 3, 2, 0, 1};

        System.out.println("Array 1: " + numbers);
        // prints "nonsense" (the array address, not the array)
        // To convert an array to a string requires a method (import java.util.Arrays)
        System.out.println("Array 1: " + Arrays.toString(numbers));
        System.out.println("Array 2: " + Arrays.toString(numbers2));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2;
        }
        System.out.println("Array 1: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = numbers2[i] * 2;
        }
        System.out.println("Array 2: " + Arrays.toString(numbers2));

        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 != 0) {
                numbers2[i] = numbers2[i] * 2;
            }
        }
        System.out.println("Array 2: " + Arrays.toString(numbers2));

        System.out.println("Array 3: " + Arrays.toString(numbers3));
        Arrays.sort(numbers3);
        System.out.println("Array 3: " + Arrays.toString(numbers3));
    }
}
