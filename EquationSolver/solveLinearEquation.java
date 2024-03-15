import java.util.Scanner;

public class solveLinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficient of x:");
        double coefficientX = scanner.nextDouble();

        System.out.println("Enter the constant term:");
        double constantTerm = scanner.nextDouble();

        if (coefficientX == 0) {
            if (constantTerm == 0) {
                System.out.println("Infinite solutions (Any real number is a solution)");
            } else {
                System.out.println("No solution");
            }
        } else {
            // Solve equation
            double solution = -constantTerm / coefficientX;
            System.out.println("The solution is: x = " + solution);
        }

        scanner.close();
    }
}
