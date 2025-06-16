import java.util.*;
class VolumeOfCylinder{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		double height = sc.nextDouble();
		double radius=sc.nextDouble();
		
		double Volume= (3.14)*radius*radius*height;

		System.out.println("The Voulme of Cylinder is "+Volume);
	}
}