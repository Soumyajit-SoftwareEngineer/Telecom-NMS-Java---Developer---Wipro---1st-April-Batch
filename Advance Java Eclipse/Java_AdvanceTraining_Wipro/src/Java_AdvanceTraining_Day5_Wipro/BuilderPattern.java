package Java_AdvanceTraining_Day5_Wipro;

class ShoppingItem {
    private String itemName;
    int quantity;
    private double pricePerUnit;

    public ShoppingItem(String itemName, int quantity, 
    		double pricePerUnit) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Quantity: " + quantity + ","
        		+ " Price per unit: $" + pricePerUnit + ", "
        				+ "Total Price: $" + getTotalPrice();
    }
}

class ShoppingBuilder {
    private ShoppingItem item;

    public ShoppingBuilder(String itemName, int quantity, 
    		double pricePerUnit) {
        this.item = new ShoppingItem(itemName, quantity, 
        		pricePerUnit);
    }

    public ShoppingBuilder setQuantity(int quantity) {
        this.item.quantity = quantity;
        return this;
    }

    public ShoppingItem build() {
        return this.item;
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        ShoppingItem groceryItem = new ShoppingBuilder
        		("Grocery", 2, 5.0).build();
        System.out.println(groceryItem);

        ShoppingItem vegetableItem = new ShoppingBuilder
        		("Vegetable", 1, 3.5)
                .setQuantity(3)
                .build();
        System.out.println(vegetableItem);

        ShoppingItem fruitItem = new ShoppingBuilder("Fruit", 
        		5, 2.0)
                .setQuantity(10)
                .build();
        System.out.println(fruitItem);
    }
}
