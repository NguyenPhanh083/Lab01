import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose whether to enter matrices manually or use constants
        System.out.println("Enter 1 to input matrices manually or 2 to use constant matrices: ");
        int choice = scanner.nextInt();

        int[][] m1, m2; //2 matrices

        if (choice == 1) {
            // Input matrices manually
            System.out.print("Enter the number of rows and columns of the matrices: ");
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            // Input matrix 1
            System.out.println("Enter elements of the first matrix:");
            m1 = inputMatrix(rows, cols, scanner);

            // Input matrix 2
            System.out.println("Enter elements of the second matrix:");
            m2 = inputMatrix(rows, cols, scanner);
        } else if (choice == 2) {
            // Use constant matrices
            m1 = new int[][]{{4, 2, 8}, {5, 1, 6}, {7, 8, 3}};
            m2 = new int[][]{{3, 8, 6}, {5, 2, 9}, {7, 4, 1}};
            System.out.println("Constant matrices:");
            System.out.println("Matrix 1: ");
            printMatrix(m1);
            System.out.println("Matrix 2: ");
            printMatrix(m2);
        } else {
            System.out.println("Invalid choice. Exiting program.");
            scanner.close();
            return;
        }

        // Add matrices
        int[][] sum = addMatrices(m1, m2);

        // Display the result
        System.out.println("Sum of the matrices:");
        printMatrix(sum);

        scanner.close();
    }

    // Method to input matrix elements from the user
    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
