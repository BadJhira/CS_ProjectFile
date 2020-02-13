package CS_202.W4.InClass_FooBar;
// Doug Gilchrist 1/27/20 [FooBar Inheritance]
public class FooMain {
    public static void main(String[] args) {
        Foo pity[] = { new Foo(), new Bar(), new Baz(), new Mumble() };

        for (int i = 0; i < pity.length; i++) {
            pity[i].method1();
            pity[i].method2();
            System.out.println(pity[i].toString());
            System.out.println();
        }
    }
}
