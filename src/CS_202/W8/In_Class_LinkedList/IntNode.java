package CS_202.W8.In_Class_LinkedList;
// Doug Gilchrist 2/26/20 [Linked Lists]
public class IntNode {
    // properties
    int data;
    IntNode next;

    //constructors
    public IntNode(int data) {
        this.data = data;
        this.next = null;
    }

    public IntNode(int data, IntNode next) {
        this.data = data;
        this.next = next;
    }
}
