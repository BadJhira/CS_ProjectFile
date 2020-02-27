package CS_202.W8.In_Class_LinkedList;

public class LinkedIntMain {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList(42, 43, 44, 45);
        LinkedIntList empty = new LinkedIntList();

        System.out.println("List: " + list);
        System.out.println("Empty: " + empty);
        System.out.println("List[2]: " + list.get(2));

        list.add(77, 2);
        System.out.println("List: " + list);

        list.removeIndex(4);
        System.out.println("List: " + list);

        list.removeValue(77);
        System.out.println("List: " + list);

        System.out.println("Index of 44: " + list.getIndex(44));
        System.out.println("Index of 79: " + list.getIndex(79));

        System.out.println("hasOddEven List: " + list.hasOddEven());
        System.out.println("hasOddEven Empty: " + empty.hasOddEven());

        list.add(42);
        list.add(66);
        list.add(42);
        list.add(69);

        System.out.println("List: " + list);
        for (int i = 1; i <= 3; i++) {
            list.removeLast(42);
        }

        System.out.println("List: " + list);
    }
}
