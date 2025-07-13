import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Display Cart");
            System.out.println("2. Remove an Item");
            System.out.println("3. Add an Item");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    cart.displayCart();
                    break;
                case 2:
                    System.out.print("Enter item to remove: ");
                    String remItem = scanner.nextLine();
                    System.out.print("Enter quantity to remove: ");
                    int remQty = scanner.nextInt();
                    cart.removeItem(remItem, remQty);
                    break;
                case 3:
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    System.out.print("Enter quantity to add: ");
                    int addQty = scanner.nextInt();
                    cart.addItem(addItem, addQty);
                    break;
                case 4:
                    double total = cart.checkout();
                    System.out.printf("Total due: $%.2f%n", total);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
