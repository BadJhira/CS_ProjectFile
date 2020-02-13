package CS_141.W8.InClass;

import java.util.Arrays;
// 11/14/19 Doug Gilchrist [Mystery Array]
public class MysteryArray {
    public static void main(String[] args) {

        mystery(new int[] {6, 3});
        mystery(new int[] {8});
        // Doesn't throw exception - method doesn't enter for loop (boolean is false):
        // (i = i; i < length(1);)  Fails immediately, exits loop before loop body executes
        mystery(new int[] {2, 4, 6});
        mystery(new int[] {1, 2, 3, 4});
        mystery(new int[] {7, 3, 2, 0, 5});
    }

    public static void mystery(int[] list) {
        for (int i = 1; i < list.length; i++) {
            list[i] = list[i] + list[i - 1];
        }
        System.out.println(Arrays.toString(list));
    }
}

