package CS_202.W8.PracticeIt;

// ListNode is a class for storing a single node of a linked list.  This
// node class is for a list of integer values.
// Most of the icky code is related to the task of figuring out
// if the student has accidentally created a cycle by pointing a later part of the list back to an earlier part.

import java.util.*;

public class ListNode {
    private static final List<ListNode> ALL_NODES = new ArrayList<ListNode>();

    public static void clearCycleData() {
        for (ListNode node : ALL_NODES) {
            node.visited = false;
            node.cycle = false;
        }
    }

    public int data;          // data stored in this node
    public ListNode next;     // link to next node in the list
    public boolean visited;   // has this node been seen yet?
    public boolean cycle;     // is there a cycle at this node?

    // post: constructs a node with data 0 and null link
    public ListNode() {
        this(0, null);
    }

    // post: constructs a node with given data and null link
    public ListNode(int data) {
        this(data, null);
    }

    // post: constructs a node with given data and given link
    public ListNode(int data, ListNode next) {
        ALL_NODES.add(this);
        this.data = data;
        this.next = next;
        this.visited = false;
        this.cycle = false;
    }

    public ListNode __gotoNext() {
        return __gotoNext(true);
    }

    public ListNode __gotoNext(boolean checkForCycle) {
        if (checkForCycle) {
            visited = true;

            if (next != null) {
                if (next.visited) {
                    // throw new IllegalStateException("cycle detected in list");
                    next.cycle = true;
                }
                next.visited = true;
            }
        }
        return next;
    }
}