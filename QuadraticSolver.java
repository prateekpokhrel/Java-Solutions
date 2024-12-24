import java.util.Scanner;

public class QuadraticSolver {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the coefficients
        System.out.print("Enter the coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter the coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter the coefficient c: ");
        double c = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Call the method to solve the quadratic equation
        solveQuadratic(a, b, c);
    }

    // Method to solve the quadratic equation
    public static void solveQuadratic(double a, double b, double c) {
        // Check if 'a' is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation because a = 0.");
            return;
        }

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        // Check if discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("There is one real root (repeated):");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and distinct:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
