import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month, year = 0;

        do {
            System.out.print("Enter the month (full name, abbreviation, 3 letters, or number): ");
            String monthInput = scanner.next();

            month = getMonth(monthInput);
            if (month == -1) {
                System.out.println("Invalid month. Please try again.");
                continue;
            }

            System.out.print("Enter the year: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a valid year: ");
                scanner.next();
            }
            year = scanner.nextInt();

            if (year < 0) {
                System.out.println("Year cannot be negative. Please try again.");
            }
        } while (month == -1 || year < 0);

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days in the month: " + days);

        scanner.close();
    }

    public static int getMonth(String month) {
        String[] months = {"january", "february", "march", "april", "may", "june", 
                           "july", "august", "september", "october", "november", "december"};
        String[] abbreviations = {"jan.", "feb.", "mar.", "apr.", "may", "jun.", 
                                  "jul.", "aug.", "sep.", "oct.", "nov.", "dec."};
        String[] shortForms = {"jan", "feb", "mar", "apr", "may", "jun", 
                               "jul", "aug", "sep", "oct", "nov", "dec"};

        for (int i = 0; i < months.length; i++) {
            if (month.equalsIgnoreCase(months[i]) || month.equalsIgnoreCase(abbreviations[i]) || month.equalsIgnoreCase(shortForms[i])) {
                return i + 1; // January is 1, February is 2, etc.
            }
        }
        try {
            int monthNumber = Integer.parseInt(month);
            if (monthNumber >= 1 && monthNumber <= 12) {
                return monthNumber;
            }
        } catch (NumberFormatException e) {
            // Not a valid number
        }
        return -1;
    }

    // Method to get the number of days in a month of a given year
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1; // Invalid month
        }

        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }
}
