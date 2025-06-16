import java.util.*;
class PowerCalculation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		double num = sc.nextDouble();
		double exp=sc.nextDouble();
		
		 double power = Math.pow(num,exp);

		System.out.println( num+" ^ "+exp+" is "+power);
	}
}