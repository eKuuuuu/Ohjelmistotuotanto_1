import week3_saturday.DegreeLengthCalculator;

import java.util.Scanner;

public static void main() {
    System.out.println("Please give me your degree (e.g., Bachelor(1), Master(2), PhD(3): ");
    Scanner scanner = new Scanner(System.in);
    int degree = Integer.parseInt(scanner.nextLine());

    System.out.println("Calculating the length of time to complete a " + degree + " degree...");
    int length = DegreeLengthCalculator.CalculateDegreeLength(degree);
    System.out.println("Your degree takes " + length + " years to complete.");
}