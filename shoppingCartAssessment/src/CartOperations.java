public interface CartOperations {
    void addItem(String itemName, int quantity);
    void removeItem(String itemName, int quantity);
    void displayCart();
    double checkout();
}
