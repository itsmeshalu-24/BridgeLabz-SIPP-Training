import java.util.*;
class PerimeterOfRectangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		float length = sc.nextFloat();
		float width=sc.nextFloat();
		
		float peri= 2*(length+width);

		System.out.println("The Perimeter of Rectangle is "+peri);
	}
}