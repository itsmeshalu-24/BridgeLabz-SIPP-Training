import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int eachChild = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + eachChild + " and the number of remaining chocolates is " + remaining);
    }
}
