package CS_202.W8.In_Class_LinkedList;
// Doug Gilchrist 2/24/20 [Linked Lists]
public class ListNode {
    // properties
    int data;
    ListNode next;

    // constructors
    public ListNode(int data) {
        setData(data);
        setNext(null);
    }

    public ListNode(int data, ListNode next) {
        setData(data);
        setNext(next);
    }

    // mutators
    public void setData(int data) { this.data = data; }

    public void setNext(ListNode next) { this.next = next; }

    public void addFront(int data) {
        // Set the next node as a new node with this node's current data & pointer.
        setNext(new ListNode(this.data, next));
        // Set this node's data to the new data.
        setData(data);
    }

    public void addBack(int data) {
        if (next != null)
            // If the next node has a pointer, call this method in that node.
            next.addBack(data);
        else
            // If the next node is null, build a new node and point to it.
            setNext(new ListNode(data));
    }

//
//    public void insert(int key, int data) {
//        if (this.data != key && next != null)
//            // If this node is the wrong node, and has a next node,
//            // call this method in the next node.
//            next.insert(key, data);
//        else if (this.data == key && next != null)
//            // If this node is the right node, and has a next node,
//            // build the next node with the new data and current pointer.
//            setNext(new ListNode(data, next));
//        else
//            // Otherwise if this is the right node OR the wrong node
//            // and the next pointer is null, build the next node.
//            setNext(new ListNode(data));
//    }

    // accessors
    public int size() {
        int size = 1;
        if (next != null)
            size += next.size();
        return size;
    }

    public String toString() {
        String dataString = "" + data;
        // Add the current node's data to the string.
        if (next != null) {
            // If there is a next node, call this method in the next
            // node and add it to the string.
            dataString += " -> " + next.toString();
        }
        return dataString;
    }
}
