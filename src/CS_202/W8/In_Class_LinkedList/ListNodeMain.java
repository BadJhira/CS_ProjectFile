package CS_202.W8.In_Class_LinkedList;

public class ListNodeMain {
    public static void main(String[] args) {
//        ListNode list = new ListNode();
//
//        // Node 1
//        list.data = 42;
//        list.next = new ListNode();
//
//        // Node 2
//        list.next.data = 43;
//        list.next.next = new ListNode();
//
//        // Node 3
//        list.next.next.data = 44;
//        list.next.next.next = null;
//
//        System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);

        // ===============================================================

//        ListNode list = new ListNode(42, new ListNode(43, new ListNode(44)));
//
//        System.out.println("List: " + list + "\n");
//
//        System.out.println("Add node to the end: ");
//        ListNode temp1 = new ListNode(45);
//        list.next.next.next = temp1;
//
//        System.out.println("List: " + list + "\n");
//
//        System.out.println("Add node to beginning: ");
//        ListNode temp2 = new ListNode(41, list);
//
//        System.out.println("Temp List: " + temp2 + "\n");
//
//        System.out.println("Reassign 'list': ");
//        list = temp2;
//
//        System.out.println("List: " + list + "\n");
//
//        list.add(46);
//
//        System.out.println("List: " + list + "\n");

        // ===============================================================

//        ListNode list = new ListNode(41, new ListNode(43, new ListNode(44)));
//
//        System.out.println("List: " + list);
//
//        ListNode temp = new ListNode(42, list.next);
//        list.next = temp;
//
//        System.out.println("List: " + list);
//
//        // Or, better yet...
//
//        list.next = new ListNode(77, list.next);
//        System.out.println("List: " + list);
//
//        list.insert(77, 78);
//        System.out.println("List: " + list);
//
//        list.insert(44, 45);
//        System.out.println("List: " + list);
//
//        list.insert(46, 47);
//        System.out.println("List: " + list);
        TestNode list1 = new TestNode(1, new TestNode(3));
        TestNode list2 = new TestNode(6);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2 + "\n");

        System.out.println("List 1 size: " + list1.size());
        System.out.println("List 2 size: " + list2.size() + "\n");

        System.out.println("Add 5 to end of List 1: ");
        list1.addBack(5);
        System.out.println("List 1: " + list1 + "\n");

        System.out.println("Add 2 to beginning of List 2: ");
        list2.addFront(2);
        System.out.println("List 2: " + list2 + "\n");

        System.out.println("Add 4 to the middle of List 2: ");
        list2.setNext(new TestNode(4, list2.next));
        System.out.println("List 2: " + list2 + "\n");

        System.out.println("List 1 size: " + list1.size());
        System.out.println("List 2 size: " + list2.size() + "\n");

        System.out.println("Interleaving lists: ");
        list1.next.next.next = list2.next.next;
        list2.next.next = list1.next.next;
        list1.next.next = list2.next;
        list2.next = list1.next;
        list1.next = list2;
        System.out.println("List 1: " + list1);
    }
}
