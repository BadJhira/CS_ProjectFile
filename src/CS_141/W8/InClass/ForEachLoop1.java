package CS_141.W8.InClass;
// 11/12/19 Doug Gilchrist [For Each]
public class ForEachLoop1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits) {
            fruit = fruit + "-pie";
            System.out.println(fruit);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = fruits[i] + "-pie";
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
