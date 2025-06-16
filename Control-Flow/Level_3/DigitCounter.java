import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        
        int count = 0;
        int original = Math.abs(number); 

        if (original == 0) {
            count = 1; // Special case for 0
        } else {
            while (original != 0) {
                original = original / 10; 
                count++;                 
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
