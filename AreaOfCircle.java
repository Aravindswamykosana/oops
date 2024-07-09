import java.util.Scanner;
class  AreaOfCircle{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("enter the radius::");
		double radius=sc.nextDouble();
		Circle1 c1=new Circle1(radius);
		c1.area();
	}
}
