package CS_202.W8.In_Class_LinkedList;

import CS_202.W8.PracticeIt.ListNode;

public class LinkedIntList {
    // properties
    private IntNode head;

    // constructors

    public LinkedIntList() {
        head = null;
    }

    public LinkedIntList(int... elements) {
        if (elements.length > 0) {
            head = new IntNode(elements[0]);
            IntNode current = head;
            for (int i = 1; i < elements.length; i++) {
                current.next = new IntNode(elements[i]);
                current = current.next;
            }
        }
    }

    // mutators

    public void add(int data) {
        if (head == null)
            head = new IntNode(data);
        else {
            IntNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new IntNode(data);
        }
    }

    public void add(int data, int index) {
        if (index == 0)
            head = new IntNode(data, head);
        else {
            IntNode current = nodeAt(index - 1);
            current.next = new IntNode(data, current.next);
        }
    }

    public void prepend(int data) {
//        Node newHead = new Node(data);
//        newHead.next = head;
//        head = newHead;
        head = new IntNode(data, head);
    }

    public void removeValue(int data) {
        if (head == null) {
            return;
        } else if (head.data == data) {
            head = head.next;
        } else {
            IntNode current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
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
            } else if (head.data == data)
                head = head.next;
        }
    }

    // accessors

    public int get(int index) {
        IntNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public int getIndex(int data) {
        if (head != null) {
            int index = 0;

            IntNode current = head;
            while (current != null) {
                if (current.data == data)
                    return index;

                index++;
                current = current.next;
            }
        }

        return -1;
    }

    public IntNode nodeAt(int index) {
        IntNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public int getValue(int index) {
        return nodeAt(index).data;
    }

    public int size() {
        int size = 0;

        IntNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        return size;
    }

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

    public boolean hasOddEven() {
        boolean odd = false;
        boolean even = false;

        IntNode current = head;
        while (current != null) {
            if (current.data % 2 != 0)
                odd = true;
            else
                even = true;

            if (odd && even)
                return true;

            current = current.next;
        }

        return false;
    }
}
