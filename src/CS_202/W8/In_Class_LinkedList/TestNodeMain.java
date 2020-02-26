package CS_202.W8.In_Class_LinkedList;

public class TestNodeMain {
    public static void main(String[] args) {
        TestNode list = new TestNode(1, new TestNode(2, new TestNode(3)));

        System.out.println(list);

        list.addFront(0);
        System.out.println(list);

        list.addBack(4);
        System.out.println(list);

        list.addFront(-1);
        System.out.println(list);

        System.out.println(list.get(0));
    }
}
