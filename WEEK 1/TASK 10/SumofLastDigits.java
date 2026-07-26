import java.util.Scanner;

public class SumOfLastDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lastDigit1 = Math.abs(a) % 10;
        int lastDigit2 = Math.abs(b) % 10;

        int sum = lastDigit1 + lastDigit2;

        System.out.println("Sum of last digits = " + sum);

        sc.close();
    }
}
