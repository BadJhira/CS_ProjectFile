package CS_202.W2.ZybookProjects;

import java.util.*;

public class ShoppingCart {
    // properties
    private String customerName, currentDate;
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<>();

    // constructors
    public ShoppingCart(String customerName, String currentDate) {
        setCustomerName(customerName);
        setDate(currentDate);
    }

    public ShoppingCart() {
        this("none", "January 1, 2016");
    }

    // mutators
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public void setDate(String currentDate) { this.currentDate = currentDate; }

    public void addItem(ItemToPurchase itemToPurchase) { cartItems.add(itemToPurchase); }

    public void removeItem(String itemName) {
        int index = -1;

        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(itemName))
                index = i;
        }

        if (index == -1)
            System.out.println("Item not found in cart. Nothing removed.");
        else
            cartItems.remove(index);

    }

    public void modifyItem(ItemToPurchase modifiedItem) {
        int index = -1;

        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getName().equals(modifiedItem.getName()))
                index = i;
        }

        if (index == -1)
            System.out.println("Item not found in cart. Nothing modified.");
        else
            cartItems.get(index).setQuantity(modifiedItem.getQuantity());
    }

    // accessors
    public String getCustomerName() { return customerName; }

    public String getDate() { return currentDate; }

    public int getNumItemsInCart() {
        int numItems = 0;

        for (int i = 0; i < cartItems.size(); i++) {
            numItems += cartItems.get(i).getQuantity();
        }

        return numItems;
    }

    public int getCostOfCart() {
        int total = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            total += cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
        }
        return total;
    }

    public void printCustomerAndDate() {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
    }

    public void printNumberOfItems() {
        System.out.println("Number of Items: " + getNumItemsInCart());
    }

    public void printTotal() {
        if (cartItems.size() < 1)
            System.out.println("SHOPPING CART IS EMPTY");
        for (int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemCost();
        }
        System.out.println();
        System.out.println("Total: $" + getCostOfCart());
    }

    public void printDescriptions() {
        printCustomerAndDate();
        System.out.println();
        System.out.println("Item Descriptions");
        for (int i = 0; i < cartItems.size(); i++) {
            cartItems.get(i).printItemDescription();
        }
    }
}
