import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose whether to enter an array or use a constant array
        System.out.println("Enter 1 to input array manually or 2 to use a constant array: ");
        int choice = scanner.nextInt();

        int[] array;

        if (choice == 1) {
            // Input array manually
            System.out.print("Enter the length: ");
            int length = scanner.nextInt();

            array = new int[length];
            System.out.println("Enter the elements:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }
        } else if (choice == 2) {
            // Use a constant array
            array = new int[]{0, 4, 8, 3, 6};
            System.out.println("Constant array: " + Arrays.toString(array));
        } else {
            System.out.println("Invalid choice. Exiting...");
            scanner.close();
            return;
        }

        // Sort the array
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Calculate sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Calculate average of array elements
        double average = (double) sum / array.length;
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}
