package CS_202.W8.In_Class_LinkedList;
// Doug Gilchrist 2/26/20 [Linked Lists]
public class LinkedIntList {
    // ========== PROPERTIES ==========

    private IntNode head;
    private int size;

    // ========== CONSTRUCTORS ==========

    public LinkedIntList() {
        head = null;
        size = 0;
    }

    public LinkedIntList(int... elements) {
        if (elements.length > 0) {
            head = new IntNode(elements[0]);
            size++;

            IntNode current = head;
            for (int i = 1; i < elements.length; i++) {
                current.next = new IntNode(elements[i]);
                current = current.next;
                size++;
            }
        }
    }

    // ========== MUTATORS ==========

    public void add(int data) {
        if (head == null) {
            head = new IntNode(data);
        }
        else {
            IntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new IntNode(data);
        }
        size++;
    }

    public void add(int data, int index) {
        if (index == 0)
            head = new IntNode(data, head);
        else {
            IntNode current = nodeAt(index - 1);
            current.next = new IntNode(data, current.next);
        }
        size++;
    }

    public void removeValue(int data) {
        if (head != null && head.data == data) {
            head = head.next;
            size--;
        } else if (head != null) {
            IntNode current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    size--;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void removeIndex(int index) {
        if (index == 0)
            head = head.next;
        else {
            IntNode current = nodeAt(index - 1);
            current.next = current.next.next;
        }
        size--;
    }

    public void removeLast(int data) {
        if (head != null) {
            IntNode dataLocation = null;
            IntNode current = head;
            while (current.next != null) {
                if (current.next.data == data)
                    dataLocation = current;
                current = current.next;
            }

            if (dataLocation != null) {
                dataLocation.next = dataLocation.next.next;
                size--;
            } else if (head.data == data) {
                head = head.next;
                size--;
            }
        }
    }

    public void removeFromEndToFront(int data) {
        LinkedIntList indexes = new LinkedIntList();
        int index = 0;

        IntNode current = head;
        while (current != null) {
            if (current.data == data)
                indexes.add(index, 0);
            current = current.next;
            index++;
        }

        System.out.println("Removing all instances of " + data + " from end to front.");

        current = indexes.head;
        while (current != null) {
            System.out.println("Removing index " + current.data + "...");
            removeIndex(current.data);
            current = current.next;
        }
        System.out.println("Done.");
    }

    // ========== ACCESSORS ==========

    private IntNode nodeAt(int index) {
        IntNode current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    public int getIndex(int data) {
        int index = 0;

        IntNode current = head;
        while (current != null) {
            if (current.data == data)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int getValue(int index) { return nodeAt(index).data; }

    public boolean hasOdd() {
        IntNode current = head;
        while (current != null) {
            if (current.data % 2 != 0)
                return true;
            current = current.next;
        }
        return false;
    }

    public boolean hasEven() {
        IntNode current = head;
        while (current != null) {
            while (current != null) {
                if (current.data % 2 == 0)
                    return true;
                current = current.next;
            }
        }
        return false;
    }

    public boolean hasOddEven() {
//        boolean odd = false;
//        boolean even = false;
//
//        IntNode current = head;
//        while (current != null) {
//            if (current.data % 2 != 0)
//                odd = true;
//            else
//                even = true;
//
//            if (odd && even)
//                return true;
//            current = current.next;
//        }
//        return false;
        return hasOdd() && hasEven();
    }

    public int size() { return size; }

    public String toString() {
        String string = "";
        if (head != null) {
            string += head.data;
            IntNode current = head.next;
            while (current != null) {
                string += " -> " + current.data;
                current = current.next;
            }
        }
        return "[" + string + "]";
    }
}
