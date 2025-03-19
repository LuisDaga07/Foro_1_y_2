package Calculo_;

import java.util.Scanner;


public class CalcularArea {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        double base, height;
        double area;
        
        System.out.print("Enter the base of the triangle: ");
        base = console.nextDouble();
        console.nextLine(); // Clear the buffer

        // Prompt the user to enter the height
        System.out.print("Enter the height of the triangle: ");
        height = console.nextDouble();
        console.nextLine(); // Clear the buffer

        // Validate input using an if-else structure
        if (base <= 0 || height <= 0) {
            System.out.println("Error: Base and height must be positive numbers.");
        } else {
            // Calculate the area of the triangle
            area = (base * height) / 2;

            // Display the result
            System.out.println("The area of the triangle is: " + area);
        }

        // Demonstrate a loop (while) to allow multiple calculations
        boolean continueCalculation = true;
        while (continueCalculation) {
            System.out.print("Do you want to calculate another area? (yes/no): ");
            String response = console.nextLine().toLowerCase();

            // Use a boolean expression to control the loop
            if (response.equals("no")) {
                continueCalculation = false;
                System.out.println("Thank you for using the Triangle Area Calculator!");
            } else if (response.equals("yes")) {
                // Reset values for a new calculation
                System.out.print("Enter the base of the triangle: ");
                base = console.nextDouble();
                console.nextLine();

                System.out.print("Enter the height of the triangle: ");
                height = console.nextDouble();
                console.nextLine();

                if (base <= 0 || height <= 0) {
                    System.out.println("Error: Base and height must be positive numbers.");
                } else {
                    area = (base * height) / 2;
                    System.out.println("The area of the triangle is: " + area);
                }
            } else {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }

        console.close(); // Close the scanner
    }
    
}
