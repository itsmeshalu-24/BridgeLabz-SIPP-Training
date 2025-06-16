import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive number.");
            return;
        }

        System.out.println("Factors of " + number + ":");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i);
        }
    }
}

