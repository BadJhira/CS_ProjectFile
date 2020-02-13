package CS_141.W3.BJPTextbookExercises;
// Doug Gilchrist 10/16/19 BJPTextbookExercises - Week 3 - Programming Project 1
public class Project1 {
    public static void main(String[] args) {
        System.out.println("Doug Gilchrist - Week 3");
        System.out.println(" Programming Project 1");
        System.out.println("=======================");
        System.out.println();

        treeGen(3, 4);
        System.out.println();
        treeGen(2, 5);
    }

    public static void treeGen(int numSegments, int height) {
        for (int segment = 1; segment <= numSegments; segment++) {
            for (int line = 1; line <= height; line++) {
                String spaces = stringGen(" ", (height - line - segment + numSegments));
                String stars = stringGen("*", (line * 2) + (segment * 2) - 3);
                System.out.print(spaces);
                System.out.print(stars);
                System.out.println();
            }
        }
        trunkGen(numSegments, height);
    }

    public static void trunkGen(int numSegments, int height) {
        String trunk = stringGen(" ", (height + numSegments - 2)) + "*";
        String base = stringGen(" ", (height + numSegments - 5)) + "*******";
        System.out.println(trunk);
        System.out.println(trunk);
        System.out.println(base);
    }

    public static String stringGen(String fillChar, int length) {
        String returnString = "";
        for (int line = 1; line <= length; line++) {
            returnString = returnString + fillChar;
        }
        return returnString;
    }
}
