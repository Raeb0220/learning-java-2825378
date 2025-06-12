import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World from the IntelliJ IDE!");
        // IDE = integrated development environment


        // Primitives : Boolean, int, double, char
        int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'R';
        char studentLastInitial = 'B';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);

        // Reference Types : String
        // a string is built out of characters
        String studentName = "Rae Baloco";
        String studentFirstName = "Rae";
        String studentLastName = "Baloco";
        System.out.println(studentName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA + ".");

        Scanner console = new Scanner(System.in);
        System.out.println("What do you want to update it to? ");
        studentGPA = console.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA + ".");


    }
}
