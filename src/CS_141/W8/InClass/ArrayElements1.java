package CS_141.W8.InClass;

import java.util.Arrays;
// 11/12/19 Doug Gilchrist [Array Elements]
public class ArrayElements1 {
    public static void main(String[] args) {
        int[] a = {1, 7, 5, 6, 4, 14, 11};

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                a[i + 1] = a[i + 1] * 2;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
