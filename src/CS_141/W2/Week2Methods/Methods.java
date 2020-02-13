package CS_141.W2.Week2Methods;
// Doug Gilchrist
public class Methods {
    public static void main (String[] args){
        blankSign();
        botHalfSign();
        stopSign();
        topHalfSign();
    }

    public static void blankSign() {
        Methods.topSign();
        Methods.botSign();
        System.out.println();
    }

    public static void botHalfSign() {
        Methods.botSign();
        Methods.plusLine();
        System.out.println();
    }

    public static void stopSign() {
        Methods.topSign();
        Methods.stopLine();
        Methods.botSign();
        System.out.println();
    }

    public static void topHalfSign() {
        Methods.topSign();
        Methods.plusLine();
    }

    public static void topSign() {
        System.out.println("  ________  ");
        System.out.println(" /        \\");
        System.out.println("/          \\");
    }

    public static void botSign() {
        System.out.println("\\          /");
        System.out.println(" \\________/ ");
    }

    public static void plusLine() {
        System.out.println("+----------+");
    }

    public static void stopLine() {
        System.out.println("|   STOP   |");
    }
}
