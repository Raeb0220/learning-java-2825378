import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.print("Pick a number between 1 and 10: ");
        Scanner console = new Scanner(System.in);

        int inputtedNum = console.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
