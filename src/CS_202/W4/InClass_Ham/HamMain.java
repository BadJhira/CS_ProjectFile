package CS_202.W4.InClass_Ham;
// Doug Gilchrist 1/27/20 [Ham Inheritance]
public class HamMain {
    public static void main(String[] args) {
        Ham ham_array[] = { new Ham(), new Lamb(), new Yam(), new Spam() };

        for (int i = 0; i < ham_array.length; i++) {
            ham_array[i].a();
            System.out.println(ham_array[i].toString());
            System.out.println();
        }
    }
}
