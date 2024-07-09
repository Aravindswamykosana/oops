import java.util.Scanner;
class  AreaOfRectangle1{
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args) {
		System.out.println("enter the length1 value::");
		double length=sc.nextDouble();
		System.out.println("enter the breadth1 value::");
		double breadth=sc.nextDouble();
		Rectangle1 r1=new Rectangle1(length,breadth);
		r1.areaOfRect();

		System.out.println("************");
		System.out.println("enter the length2 value::");
		double length1=sc.nextDouble();
		System.out.println("enter the breadth2 value::");
		double breadth1=sc.nextDouble();
		Rectangle1 r2=new Rectangle1(length1,breadth1);
		r2.areaOfRect();
	}
}