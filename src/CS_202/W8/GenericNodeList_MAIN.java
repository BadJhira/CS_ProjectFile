package CS_202.W8;

public class GenericNodeList_MAIN {
    public static void main(String[] args) {
        GenericNodeList<String> stringList = new GenericNodeList<>(
                "lobster", "Klingon", "rocket", "marinate", "Brighton");
        GenericNodeList<Integer> intList = new GenericNodeList<>(
                2, 5, 7, -11, 23, 14, 5, 3, 69);
        GenericNodeList<Boolean> boolList = new GenericNodeList<>(
                true, false, false, true, false, true);
        GenericNodeList<Double> doubleList = new GenericNodeList<>(
                23.5, 3.3333, 0.9999999, 1.1, 50.25);
        GenericNodeList empty = new GenericNodeList();

        printLists(stringList, intList, boolList, doubleList, empty);

        stringList.add("spatula");
        intList.add(5);
        boolList.add(false);
        doubleList.add(3.3333);

        printLists(stringList, intList, boolList, doubleList, empty);

        stringList.add("disaster", 2);
        intList.add(72, 3);
        boolList.add(false, 0);
        doubleList.add(44.27, doubleList.size() - 1);

        printLists(stringList, intList, boolList, doubleList, empty);

        stringList.remove("marinate");
        intList.remove(14);
        boolList.remove(true);
        doubleList.remove(1.1); // argh! doubles and their imprecision

        printLists(stringList, intList, boolList, doubleList, empty);

        stringList.removeIndex(4);
        intList.removeIndex(4);
        boolList.removeIndex(3);
        doubleList.removeIndex(3);

        printLists(stringList, intList, boolList, doubleList, empty);

        stringList.removeFromEndToFront("Klingon");
        System.out.println();
        intList.removeFromEndToFront(5);
        System.out.println();
        boolList.removeFromEndToFront(false);
        System.out.println();
        doubleList.removeFromEndToFront(3.3333); // more imperfect doubles
        System.out.println();

        printLists(stringList, intList, boolList, doubleList, empty);
    }

    public static void printLists(GenericNodeList... elements) {
        for (GenericNodeList list : elements) {
            System.out.println("size " + list.size() + " " + list);
        }
        System.out.println();
    }
}
