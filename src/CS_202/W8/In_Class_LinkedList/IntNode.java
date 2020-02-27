package CS_202.W8.In_Class_LinkedList;

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
