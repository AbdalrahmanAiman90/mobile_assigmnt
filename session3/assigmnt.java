import java.util.Scanner;

public class assigmnt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(base + " the power of " + exponent + " is: " + result);

        scanner.close();
    }
}