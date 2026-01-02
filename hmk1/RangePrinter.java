import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int b = scanner.nextInt();

        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else if (a > b) {
            for (int i = a - 1; i > b; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("No integers between the given numbers.");
        }

        scanner.close();
    }
}
