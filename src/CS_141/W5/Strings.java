package CS_141.W5;
// Doug Gilchrist - 10/24/19 - Strings!
public class Strings {
    public static void main(String[] args) {
        names();
        javaExtraction();
    }

    public static void names() {
        String s1 = "Douglas Gilchrist";
        String s2 = "Charles Gilchrist";

        System.out.println(s1.length()); // 17
        System.out.println(s1.indexOf("e")); // -1
        System.out.println(s1.substring(7, 10)); // " Gi"

        String s3 = s2.substring(1, 7);
        System.out.println(s3.toLowerCase()); // "harles"
    }

    public static void javaExtraction() {
        String book = "Building Java Programs";
        String java1 = book.substring(9, 13);

        System.out.println(java1); // "Java"
    }
}
