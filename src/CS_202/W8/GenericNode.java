package CS_202.W8;

public class GenericNode<Type extends Comparable<Type>> {
    // ========== PROPERTIES ==========

    Type data;
    GenericNode<Type> next;

    // ========== CONSTRUCTORS ==========

    public GenericNode(Type data) {
        this.data = data;
        this.next = null;
    }

    public GenericNode(Type data, GenericNode<Type> next) {
        this.data = data;
        this.next = next;
    }
}
