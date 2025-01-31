import java.util.Scanner;
public class main {
     public static void main(String[] args) {
       // Create a new Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read a line of text (user's name)

        // Prompt the user to enter their age
        System.out.print("Enter your height: ");
        int age = scanner.nextInt();  // Read an integer (user's age)

        // Output the results
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        // Close the scanner to prevent resource leaks
        scanner.close();
     }
}