package CS_202.W8.In_Class_LinkedList;

public class TestNode {
    // properties
    int data;
    int index = 0;
    TestNode next;

    // constructors
    public TestNode(int data) {
        setData(data);
        setNext(null);
    }

    public TestNode(int data, TestNode next) {
        setData(data);
        setNext(next);
        incrementIndices();
    }

    // mutators
    public void setData(int data) { this.data = data; }

    public void setIndex(int index) { this.index = index; }

    public void setNext(TestNode next) { this.next = next; }

    public void incrementIndex() { this.index++; }

    public void incrementIndices() {
        if (next != null) {
            next.incrementIndex();
            next.incrementIndices();
        }
    }

    public void addFront(int data) {
        // Set the next node as a new node with this node's current data & pointer.
        setNext(new TestNode(this.data, next));
        // Set this node's data to the new data.
        setData(data);
        // Set the next index correct.
        next.setIndex(index + 1);
    }

    public void addBack(int data) {
        if (next != null)
            // If the next node has a pointer, call this method in that node.
            next.addBack(data);
        else {
            // If the next node is null, build a new node and point to it.
            setNext(new TestNode(data));
            next.setIndex(index + 1);
        }
    }

    public void remove(int data) {
        // TODO: How the hell do we remove stuff?
    }

    // accessors
    public int get(int index) {
        if (this.index != index && next != null)
            return next.get(index);
        else if (this.index != index)
            throw new IndexOutOfBoundsException();
        else
            return data;
    }

    public int size() {
        int size = 1;
        if (next != null)
            size += next.size();
        return size;
    }

    public String toString() {
        String dataString = ""+ index + ": " + data;
        // Add the current node's data to the string.
        if (next != null) {
            // If there is a next node, call this method in the next
            // node and add it to the string.
            dataString += " -> " + next.toString();
        }
        return dataString;
    }
}
