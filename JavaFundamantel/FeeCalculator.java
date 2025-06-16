import java.util.Scanner;

public class FeeCalculator {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

      System.out.print("Enter the course fee : ");
      double fee = sc.nextDouble();

      System.out.print("Enter the University discount percentage");
      double discountPercent = sc.nextDouble();

      double discount = (discountPercent / 100)*fee;
      double  finalFee = fee - discount;

 System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
}
}