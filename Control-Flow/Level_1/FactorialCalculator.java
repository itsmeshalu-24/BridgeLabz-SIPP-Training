import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            long factorial = 1;
            int i = 1;

            while (i <= num) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}
