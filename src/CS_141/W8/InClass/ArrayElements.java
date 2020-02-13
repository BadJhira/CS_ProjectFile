package CS_141.W8.InClass;

import java.util.Arrays;
// 11/12/19 Doug Gilchrist [Array Elements]
public class ArrayElements {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        while (numbers[numbers.length - 1] < 100) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] += 10;
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
