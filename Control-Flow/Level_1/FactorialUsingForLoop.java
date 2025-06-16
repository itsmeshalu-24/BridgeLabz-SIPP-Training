import java.util.Scanner;

public class FactorialUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num >= 0) {
            long factorial = 1;

            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " is: " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }
    }
}
