import java.util.*;

public class ShoppingCart implements CartOperations {
    private Map<String, Integer> cart = new HashMap<>();
    private Map<String, Item> inventory = new HashMap<>();

    public ShoppingCart() {
        // Sample inventory
        inventory.put("apple", new Item("apple", 0.99));
        inventory.put("bread", new Item("bread", 2.49));
        inventory.put("milk", new Item("milk", 1.99));
    }

    @Override
    public void addItem(String itemName, int quantity) {
        if (!inventory.containsKey(itemName)) {
            System.out.println("Item not found.");
            return;
        }
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    @Override
    public void removeItem(String itemName, int quantity) {
        if (!cart.containsKey(itemName)) {
            System.out.println("Item not in cart.");
            return;
        }

        int currentQty = cart.get(itemName);
        int newQty = currentQty - quantity;

        if (newQty <= 0) {
            cart.remove(itemName);
        } else {
            cart.put(itemName, newQty);
        }
    }

    @Override
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Cart contents:");
        for (String item : cart.keySet()) {
            System.out.println(item + " x" + cart.get(item));
        }
    }

    @Override
    public double checkout() {
        double total = 0.0;
        for (String itemName : cart.keySet()) {
            Item item = inventory.get(itemName);
            total += item.getPrice() * cart.get(itemName);
        }

        cart.clear();
        System.out.println("Cart is now empty.");
        return total;
    }
}
