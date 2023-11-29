package qpassignment;

import com.fasterxml.jackson.databind.ObjectMapper;

class GroceryItem {
    private String name;
    private double price;
    private int quantity;

    // Constructors, getters, setters, etc.

    public GroceryItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Example JSON data
        String jsonData = "{ \"name\": \"Grocery Item Name\", \"price\": 5.99, \"quantity\": 100 }";

        try {
            //  Java object
            GroceryItem groceryItem = objectMapper.readValue(jsonData, GroceryItem.class);

            // Do something with the grocery item object
            System.out.println(groceryItem.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
