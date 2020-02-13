package CS_141.W3.BJPTextbookExercises;
// Doug Gilchrist 10/16/19 BJPTextbookExercises - Week 3 - Programming Project 2
public class Project3 {
    public static void main(String[] args) {
        System.out.println("Doug Gilchrist - Week 3");
        System.out.println(" Programming Project 3");
        System.out.println("=======================");
        System.out.println();

        table(12);
    }

    public static void table(int days) {
        System.out.println("Day \t\tPresents Received\t  Total Presents");
        int presents = 0;
        for (int line = 1; line <= days; line++) {
            presents += line;
            System.out.println(line + "\t\t\t\t\t" + line + "\t\t\t\t\t" + presents);
        }
    }
}
