package CS_202.W8;

import CS_202.W8.In_Class_LinkedList.IntNode;

public class GenericNodeList<Type extends Comparable<Type>> {
    // ========== PROPERTIES ==========

    private GenericNode<Type> head;
    private int size;

    // ========== CONSTRUCTORS ==========

    public GenericNodeList() {
        head = null;
        size = 0;
    }

    @SafeVarargs
    public GenericNodeList(Type... elements) {
        if (elements.length > 0) {
            head = new GenericNode<>(elements[0]);
            size++;

            GenericNode<Type> current = head;
            for (int i = 1; i < elements.length; i++) {
                current.next = new GenericNode<>(elements[i]);
                current = current.next;
                size++;
            }
        }
    }

    // ========== MUTATORS ==========

    public void add(Type data) {
        if (head == null)
            head = new GenericNode<>(data);
        else {
            GenericNode<Type> current = head;
            while (current.next != null)
                current = current.next;
            current.next = new GenericNode<>(data);
        }
        size++;
    }

    public void add(Type data, int index) {
        if (index == 0)
            head = new GenericNode<>(data, head);
        else if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        else {
            GenericNode<Type> current = nodeAt(index - 1);
            current.next = new GenericNode<>(data, current.next);
        }
        size++;
    }

    public void remove(Type data) {
        if (head != null && head.data == data) {
            head = head.next;
            size--;
        } else if (head != null) {
            GenericNode<Type> current = head;
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
        else if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        else {
            GenericNode<Type> current = nodeAt(index - 1);
            current.next = current.next.next;
        }
        size--;
    }

    public void removeFromEndToFront(Type data) {
        GenericNodeList<Integer> indexList = new GenericNodeList<>();
        int index = 0;

        GenericNode<Type> current = head;
        while (current != null) {
            if (current.data == data)
                indexList.add(index, 0);
            current = current.next;
            index++;
        }

        System.out.println("Removing all instances of \"" + data + "\" from end to front.");

        GenericNode<Integer> currentIndex = indexList.head;
        while (currentIndex != null) {
            System.out.println("Removing index " + currentIndex.data + "...");
            removeIndex(currentIndex.data);
            currentIndex = currentIndex.next;
        }
        System.out.println("Done.");
    }

    // ========== ACCESSORS ==========

    private GenericNode<Type> nodeAt(int index) {
        GenericNode<Type> current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    public int getIndex(Type data) {
        int index = 0;

        GenericNode<Type> current = head;
        while (current != null) {
            if (current.data == data)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public Type getValue(int index) {
        if (index == 0 && head == null)
            return null;
        else if (index == 0)
            return head.data;
        else if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        else
            return nodeAt(index).data;
    }

    public int size() { return size; }

    public String toString() {
        String string = "";
        if (head != null) {
            string += head.data;
            GenericNode<Type> current = head.next;
            while (current != null) {
                string += " -> " + current.data;
                current = current.next;
            }
        }
        return "[" + string + "]";
    }
}
