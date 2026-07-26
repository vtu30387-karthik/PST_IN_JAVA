import java.util.Scanner;

@FunctionalInterface
interface DigitSum {
    int calculate(int num);
}

public class LambdaDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Choose option:");
        System.out.println("1. Sum of even digits");
        System.out.println("2. Sum of odd digits");
        int choice = sc.nextInt();

        // Lambda for even digit sum
        DigitSum evenSum = (n) -> {
            int sum = 0;
            n = Math.abs(n);
            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
                n /= 10;
            }
            return sum;
        };

        // Lambda for odd digit sum
        DigitSum oddSum = (n) -> {
            int sum = 0;
            n = Math.abs(n);
            while (n > 0) {
                int digit = n % 10;
                if (digit % 2 != 0) {
                    sum += digit;
                }
                n /= 10;
            }
            return sum;
        };

        if (choice == 1) {
            System.out.println("Sum of even digits = " + evenSum.calculate(num));
        } else if (choice == 2) {
            System.out.println("Sum of odd digits = " + oddSum.calculate(num));
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
