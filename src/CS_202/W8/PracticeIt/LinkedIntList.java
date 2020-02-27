package CS_202.W8.PracticeIt;

import java.util.NoSuchElementException;

// A LinkedIntList object can be used to store a list of integers.
public class LinkedIntList {
    private ListNode front;   // node holding first value in list (null if empty)
    private String name = "front";   // string to print for front of list

    // Constructs an empty list.
    public LinkedIntList() {
        front = null;
    }

    // Constructs a list containing the given elements.
    // For quick initialization via Practice-It test cases.
    public LinkedIntList(int... elements) {
        this("front", elements);
    }

    public LinkedIntList(String name, int... elements) {
        this.name = name;
        if (elements.length > 0) {
            front = new ListNode(elements[0]);
            ListNode current = front;
            for (int i = 1; i < elements.length; i++) {
                current.next = new ListNode(elements[i]);
                current = current.next;
            }
        }
    }

    // Constructs a list containing the given front node.
    // For quick initialization via Practice-It ListNode test cases.
    private LinkedIntList(String name, ListNode front) {
        this.name = name;
        this.front = front;
    }

    // Appends the given value to the end of the list.
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    // Inserts the given value at the given index in the list.
    // Precondition: 0 <= index <= size
    public void add(int index, int value) {
        if (index == 0) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }

    public boolean equals(Object o) {
        if (o instanceof LinkedIntList) {
            LinkedIntList other = (LinkedIntList) o;
            return toString().equals(other.toString());   // hackish
        } else {
            return false;
        }
    }

    // Returns the integer at the given index in the list.
    // Precondition: 0 <= index < size
    public int get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Removes the value at the given index from the list.
    // Precondition: 0 <= index < size
    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = front;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
    }

    // Returns the number of elements in the list.
    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Returns a text representation of the list, giving
    // indications as to the nodes and link structure of the list.
    // Detects student bugs where the student has inserted a cycle
    // into the list.
    public String toFormattedString() {
        ListNode.clearCycleData();

        String result = this.name;

        ListNode current = front;
        boolean cycle = false;
        while (current != null) {
            result += " -> [" + current.data + "]";
            if (current.cycle) {
                result += " (cycle!)";
                cycle = true;
                break;
            }
            current = current.__gotoNext();
        }

        if (!cycle) {
            result += " /";
        }

        return result;
    }

    // Returns a text representation of the list.
    public String toString() {
        return toFormattedString();
    }

    // Returns a shorter, more "java.util.LinkedList"-like text representation of the list.
    public String toStringShort() {
        ListNode.clearCycleData();

        String result = "[";

        ListNode current = front;
        boolean cycle = false;
        while (current != null) {
            if (result.length() > 1) {
                result += ", ";
            }
            result += current.data;
            if (current.cycle) {
                result += " (cycle!)";
                cycle = true;
                break;
            }
            current = current.__gotoNext();
        }

        if (!cycle) {
            result += "]";
        }

        return result;
    }

    // BJP5.16.1 set()
    public void set(int index, int value) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.data = value;
    }

    // BJP5.16.2 min()
    public int min() {
        if (front == null)
            throw new NoSuchElementException();

        int min = front.data;
        ListNode current = front.next;
        while (current != null) {
            if (current.data < min)
                min = current.data;

            current = current.next;
        }

        return min;
    }

    // BJP5.16.3 isSorted()
    public boolean isSorted() {
        if (front != null && front.next != null) {
            ListNode current = front;
            while (current.next != null) {
                if (!(current.data <= current.next.data))
                    return false;
                current = current.next;
            }
        }
        return true;
    }

    // BJP5.16.4 lastIndexOf()
    public int lastIndexOf(int value) {
        int result = -1;
        if (front != null) {
            int index = 0;
            ListNode current = front;
            while (current != null) {
                if (current.data == value)
                    result = index;
                index++;
                current = current.next;
            }
        }
        return result;
    }

    // BJP5.16.5 countDuplicates()
    public int countDuplicates() {
        int duplicates = 0;
        if (front != null && front.next != null) {
            ListNode current = front;
            while (current.next != null) {
                if (current.data == current.next.data)
                    duplicates++;
                current = current.next;
            }
        }
        return duplicates;
    }

    // BJP5.16.6 hasTwoConsecutive()
    public boolean hasTwoConsecutive() {
        if (front != null && front.next != null) {
            ListNode current = front;
            while (current.next != null) {
                if (current.data + 1 == current.next.data)
                    return true;
                current = current.next;
            }
        }
        return false;
    }

    // BJP5.16.7 deleteBack()
    public int deleteBack() {
        int value;
        if (front == null)
            throw new NoSuchElementException();
        else if (front.next == null) {
            value = front.data;
            front = null;
        } else {
            ListNode current = front;
            while (current.next.next != null)
                current = current.next;
            value = current.next.data;
            current.next = null;
        }
        return value;
    }

    // BJP5.16.8 switchPairs()
    public void switchPairs() {
        if (front != null && front.next != null) {
            ListNode first = front;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            front = second;

            ListNode current = first;
            while (current.next != null && current.next.next != null) {
                first = current.next;
                second = first.next;

                first.next = second.next;
                second.next = first;
                current.next = second;

                current = first;
            }
        }
    }

    // BJP5.16.9 stutter()
    public void stutter() {
        ListNode current = front;
        while (current != null) {
            current.next = new ListNode(current.data, current.next);
            current = current.next.next;
        }
    }

    // BJP5.16.10 stretch()
    public void stretch(int n) {
        if (n < 1)
            front = null;
        else {
            ListNode current = front;
            while (current != null) {
                for (int i = 1; i <= n - 1; i++) {
                    current.next = new ListNode(current.data, current.next);
                    current = current.next;
                }
                current = current.next;
            }
        }
    }

    // BJP5.16.11 compress()
    public void compress(int n) {
        if (front != null && front.next != null) {
            ListNode current = front;
            while (current != null) {
                for (int i = 1; i < n; i++) {
                    if (current.next != null) {
                        current.data += current.next.data;
                        current.next = current.next.next;
                    }
                }
                current = current.next;
            }
        }
    }

    // BJP5.16.12 split()
    public void split() {
        if (front != null && front.next != null) {
            ListNode current = front;
            while (current.next != null) {
                if (current.next.data < 0) {
                    ListNode negative = current.next;
                    current.next = current.next.next;
                    negative.next = front;
                    front = negative;
                } else
                    current = current.next;
            }
        }
    }
}
