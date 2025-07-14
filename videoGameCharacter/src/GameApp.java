import java.util.ArrayList;
import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> characters = new ArrayList<>();

        // Add characters to the list
        characters.add(new Warrior("Warrior", 100, 20, "axe"));
        characters.add(new Mage("Mage", 80, 25, "Fireball"));
        characters.add(new Archer("Archer", 90, 18, 15));

        boolean running = true;

        System.out.println("Welcome to the Wonderful World of Lore!");

        while (running) {
            // Display the menu
            System.out.println("\nChoose a character to attack:");
            for (int i = 0; i < characters.size(); i++) {
                System.out.println((i + 1) + ". " + characters.get(i).name);
            }
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int choice = -1;

            // Validate input
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume invalid input
                continue;
            }

            if (choice == 0) {
                running = false;
                System.out.println("Exiting game. Goodbye!");
            } else if (choice >= 1 && choice <= characters.size()) {
                characters.get(choice - 1).attack();
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
