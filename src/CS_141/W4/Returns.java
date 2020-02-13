package CS_141.W4;
// Doug Gilchrist 10/15/19 Returns
public class Returns {
    public static void main(String[] args) {

        table(360, 30);
        table(120, 10);

    }

    public static void table(int maximum, int increment) {
        System.out.println("n\t sin(n)\t cos(n)");
        int entires = maximum / increment;
        for (int line = 0; line <= entires; line++) {
            int n = line * increment;
            double sin = sin(n);
            double cos = cos(n);
            System.out.println(n + "\t " + sin + "\t " + cos);
        }
        System.out.println();
    }

    public static double sigFigs2(double num) {
        return (Math.round(num * 100.0) / 100.0);
    }

    public static double sin(double num) {
        return sigFigs2(Math.sin(Math.toRadians(num)));
    }

    public static double cos(double num) {
        return sigFigs2(Math.cos(Math.toRadians(num)));
    }

}
