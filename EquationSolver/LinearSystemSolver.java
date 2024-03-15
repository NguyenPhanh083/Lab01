import java.util.Scanner;

public class LinearSystemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the coefficients of the linear system ax + by = c and dx + ey = f:");
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter coefficient d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter coefficient e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter coefficient f: ");
        double f = scanner.nextDouble();

        double determinant = a * e - b * d;

        if (determinant == 0) {
            System.out.println("The system has no solution.");
        } else {
            double x = (c * e - b * f) / determinant;
            double y = (a * f - c * d) / determinant;
            System.out.println("The solution is: x = " + x + ", y = " + y);
        }

        scanner.close();
    }
}
