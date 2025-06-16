import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n > 0) {
            int sumFormula = n * (n + 1) / 2, sumWhile = 0, i = 1;
            while (i <= n) sumWhile += i++;
            System.out.println("Formula: " + sumFormula);
            System.out.println("While Loop: " + sumWhile);
            System.out.println(sumFormula == sumWhile ? "Results match!" : "Mismatch in results!");
        } else {
            System.out.println(n + " is not a natural number.");
        }
    }
}
