package CS_141.W4;
// Doug Gilchrist 10/15/19 Parameters
public class Parameters {
    public static void main(String[] args) {
        int x = 9;
        String y = "x";
        int z = 2;

        mystery(x, y, z);
        System.out.println("Main output:\t" + x + " " + y + " " + z);
        mystery(z, "y", x);
        System.out.println("Main output:\t" + z + " " + y + " " + x);
        mystery(x + 3, y + z, x +z);
        System.out.println("Main output:\t" + (x + 3) + " " + y + z + " " + (x + z));
        System.out.println("x + 3: " + (x + 3));
        System.out.println("y + z: " + (y + z));
        System.out.println("x + z: " + (x + z));
        mystery(x, "z", x);
    }

    public static void mystery(int x, String z, int y) {
        x++;
        y--;
        System.out.println("Mystery output:\t" + z + " " + y + " " + x);
    }
}
