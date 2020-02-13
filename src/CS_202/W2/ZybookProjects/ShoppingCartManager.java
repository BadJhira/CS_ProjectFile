package CS_202.W2.ZybookProjects;

import java.util.*;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ShoppingCart cart_1 = new ShoppingCart();

        System.out.println("Enter Customer's Name:");
        cart_1.setCustomerName(scnr.nextLine());
        System.out.println("Enter Today's Date:");
        cart_1.setDate(scnr.nextLine());
        System.out.println();
        System.out.println("Customer Name: " + cart_1.getCustomerName());
        System.out.println("Today's Date: " + cart_1.getDate());
        System.out.println();

        printMenu(cart_1, scnr);
    }

    private static void printMenu(ShoppingCart cart, Scanner scnr) {
        String menu = "MENU\n" +
                "a - Add item to cart\n" +
                "d - Remove item from cart\n" +
                "c - Change item quantity\n" +
                "i - Output items' descriptions\n" +
                "o - Output shopping cart\n" +
                "q - Quit\n";
        String choose = "Choose an option:";

        System.out.println(menu);
        System.out.println(choose);

        String string = scnr.nextLine();
        do {
            switch(string) {
                case "a":
                    addItem(cart, scnr);
                    System.out.println(menu);
                    System.out.println(choose);
                    scnr.nextLine();
                    break;
                case "d":
                    removeItem(cart, scnr);
                    System.out.println(menu);
                    System.out.println(choose);
                    break;
                case "c":
                    changeQuantity(cart, scnr);
                    System.out.println(menu);
                    System.out.println(choose);
                    scnr.nextLine();
                    break;
                case "i":
                    cartDescriptions(cart);
                    System.out.println(menu);
                    System.out.println(choose);
                    break;
                case "o":
                    cartOutput(cart);
                    System.out.println(menu);
                    System.out.println(choose);
                    break;
                default:
                    System.out.println(choose);
                    break;
            }

            string = scnr.nextLine();

        } while(!string.equals("q"));
    }

    private static void addItem(ShoppingCart cart, Scanner scnr) {
        ItemToPurchase newItem = new ItemToPurchase();

        System.out.println("ADD ITEM TO CART");
        System.out.println("Enter the item name:");
        newItem.setName(scnr.nextLine());
        System.out.println("Enter the item description:");
        newItem.setDescription(scnr.nextLine());
        System.out.println("Enter the item price:");
        newItem.setPrice(scnr.nextInt());
        System.out.println("Enter the item quantity:");
        newItem.setQuantity(scnr.nextInt());
        System.out.println();

        cart.addItem(newItem);
    }

    private static void removeItem(ShoppingCart cart, Scanner scnr) {
        System.out.println("REMOVE ITEM FROM CART");
        System.out.println("Enter name of item to remove:");
        cart.removeItem(scnr.nextLine());
        System.out.println();
    }

    private static void changeQuantity(ShoppingCart cart, Scanner scnr) {
        ItemToPurchase modifiedItem = new ItemToPurchase();

        System.out.println("CHANGE ITEM QUANTITY");
        System.out.println("Enter the item name:");
        modifiedItem.setName(scnr.nextLine());
        System.out.println("Enter the new quantity:");
        modifiedItem.setQuantity(scnr.nextInt());
        cart.modifyItem(modifiedItem);
        System.out.println();
    }

    private static void cartDescriptions(ShoppingCart cart) {
        System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
        cart.printDescriptions();
        System.out.println();
    }

    private static void cartOutput(ShoppingCart cart) {
        System.out.println("OUTPUT SHOPPING CART");
        cart.printCustomerAndDate();
        cart.printNumberOfItems();
        System.out.println();
        cart.printTotal();
        System.out.println();
    }
}
