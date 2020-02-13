package CS_141.W8.PracticeIt;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeItTest {
    public static void main(String[] args) {
        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list [i] + (list[i] / list[0]);
        }
        System.out.println(Arrays.toString(list));
    }
}
