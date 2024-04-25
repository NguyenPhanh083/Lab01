import java.util.Scanner;

public class DisplayCenteredTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many rows? ");
        int n = scanner.nextInt();

        displayCenteredTriangle(n);

        scanner.close();
    }

    public static void displayCenteredTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
