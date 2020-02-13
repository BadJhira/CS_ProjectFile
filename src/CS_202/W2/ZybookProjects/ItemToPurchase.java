package CS_202.W2.ZybookProjects;

public class ItemToPurchase {
    // properties
    private String itemName, itemDescription;
    private int itemPrice, itemQuantity;

    // constructors
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
        setName(itemName);
        setDescription(itemDescription);
        setPrice(itemPrice);
        setQuantity(itemQuantity);
    }

    public ItemToPurchase() {
        this("no_name", "none", 0, 0);
    }

    // mutators
    public void setName(String name) {
        this.itemName = name;
    }

    public void setDescription(String description) { this.itemDescription = description; }

    public void setPrice(int price) {
        this.itemPrice = price;
    }

    public void setQuantity(int quantity) {
        this.itemQuantity = quantity;
    }

    // accessors
    public String getName() {
        return this.itemName;
    }

    public String getDescription() { return this.itemDescription; }

    public int getPrice() {
        return this.itemPrice;
    }

    public int getQuantity() {
        return this.itemQuantity;
    }

    public int getItemTotal() { return this.itemPrice * this.itemQuantity; }

    public void printItemCost() {
        System.out.println(getName() + " " + getQuantity() + " @ $"
                + getPrice() + " = $" + getItemTotal());
    }

    public void printItemDescription() {
        System.out.println(getName() + ": " + getDescription());
    }
}
