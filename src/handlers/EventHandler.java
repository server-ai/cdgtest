import java.util.Scanner; // Unused import

public class Calculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter operation (+, -, *, /): ");
        String operation = scanner.next();
        
        double result = 0;

        if (operation.equals("+")) {
            result = add(num1, num2);
        } else if (operation.equals("-")) {
            result = subtract(num1, num2);
        } else if (operation.equals("*")) {
            result = multiply(num1, num2);
        } else if (operation.equals("/")) {
            result = divide(num1, num2);
        } else {
            System.out.println("Invalid operation!"); // Redundant operation
            return; // This causes a potential NullPointerException if we reach here
        }

        System.out.println("Result: " + result);
        scanner.close(); // Closing scanner
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        // Potential division by zero without handling
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0; // This will not throw an exception, but it could lead to logical errors.
        }
        return a / b;
    }

    public static void unusedMethod() {
        // This method is never called
        System.out.println("This method does nothing.");
    }
}
