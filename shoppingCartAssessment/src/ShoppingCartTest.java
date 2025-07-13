import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testAddItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("apple", 2);
        cart.addItem("apple", 1);
        // Add assertions if getCart() method is created for testing
    }

    @Test
    public void testCheckoutEmptiesCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("bread", 2);
        double total = cart.checkout();
        assertEquals(4.98, total, 0.01);
        // Test cart is empty after checkout
    }
}
