import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive number.");
            return;
        }

        int i = 1;
        System.out.println("Factors of " + number + ":");
        while (i <= number) {
            if (number % i == 0)
                System.out.println(i);
            i++;
        }
    }
}

