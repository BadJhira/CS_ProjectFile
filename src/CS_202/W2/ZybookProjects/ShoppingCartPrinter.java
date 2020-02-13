package CS_202.W2.ZybookProjects;

import java.util.*;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase item_1 = new ItemToPurchase();
        ItemToPurchase item_2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item_1.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item_1.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item_1.setQuantity(scnr.nextInt());

        System.out.println();
        scnr.nextLine();

        System.out.println("Item 2");
        System.out.println("Enter the item name:");
        item_2.setName(scnr.nextLine());
        System.out.println("Enter the item price:");
        item_2.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        item_2.setQuantity(scnr.nextInt());

        System.out.println();

        System.out.println("TOTAL COST");
        System.out.println(item_1.getName() + " " + item_1.getQuantity() + " @ $"
                + item_1.getPrice() + " = $" + item_1.getItemTotal());
        System.out.println(item_2.getName() + " " + item_2.getQuantity() + " @ $"
                + item_2.getPrice() + " = $" + item_2.getItemTotal());
        System.out.println();
        System.out.println("Total: $" + (item_1.getItemTotal() + item_2.getItemTotal()));
    }
}
