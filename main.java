public class main {
     public static void main(String[] args) {
        // Declare and initialize variables of different types
        int age = 25;  
        double price = 19.99;  
        char grade = 'A'; 
        String name = "Thanh Dat Vu";  
        boolean isStudent = true;  

        // Print the variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Price: $" + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);

        // Perform some basic arithmetic with variables
        int x = 10;
        int y = 5;
        int sum = x + y;
        int product = x * y;

        // Print the results of arithmetic operations
        System.out.println("Sum of x and y: " + sum);
        System.out.println("Product of x and y: " + product);

        // Modify a variable's value and print it again
        age = 26;  // Updating the value of the variable 'age'
        System.out.println("Updated age: " + age);
    }
}