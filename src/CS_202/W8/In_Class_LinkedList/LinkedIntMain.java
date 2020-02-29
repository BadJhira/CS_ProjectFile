package CS_202.W8.In_Class_LinkedList;
// Doug Gilchrist 2/26/20 [Linked Lists]
public class LinkedIntMain {
    public static void main(String[] args) {

        LinkedIntList list = new LinkedIntList(42, 43, 44, 45);
//        LinkedIntList empty = new LinkedIntList();

        System.out.println("List:\n   size " + list.size() + ", " + list + "\n");

        list.add(77, 2);
        System.out.println("Added 77 at index 2:\n   size " + list.size() + ", " + list + "\n");

        list.removeIndex(4);
        System.out.println("Removed index 4:\n   size " + list.size() + ", " + list + "\n");

        list.removeValue(77);
        System.out.println("Removed value 77:\n   size " + list.size() + ", " + list + "\n");

        list.add(42);
        list.add(66);
        list.add(42);
        list.add(69);
        System.out.println("Added 4 values:\n   size " + list.size() + ", " + list + "\n");

        list.removeFromEndToFront(42);
        System.out.println("\nList:\n   size " + list.size() + ", " + list + "\n");

//        empty.removeFromEndToFront(42);

        System.out.println();
        System.out.println("List hasOdd: " + list.hasOdd());
        System.out.println("List hasEven: " + list.hasEven());
        System.out.println("List hasOddEven: " + list.hasOddEven());
    }
}
