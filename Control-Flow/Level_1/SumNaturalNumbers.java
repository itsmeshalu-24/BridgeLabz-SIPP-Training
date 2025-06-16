import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
           
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using loop: " + loopSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (loopSum == formulaSum) {
                System.out.println("Both results match!");
            } else {
                System.out.println("Mismatch in results.");
            }
        } else {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }
    }
}
