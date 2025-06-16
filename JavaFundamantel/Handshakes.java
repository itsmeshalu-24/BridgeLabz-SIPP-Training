import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();

        int handshakes = (students * (students - 1)) / 2;

        System.out.println("The number of possible handshakes is " + handshakes);
    }
}
