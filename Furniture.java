import java.util.Scanner;
class Furniture {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the length:");
		double length=sc.nextDouble();
		System.out.println("enter the breadth:");
		double breadth=sc.nextDouble();
		Box1 b1=new Box1(length,breadth);
		b1.display();

		System.out.println("enter the length:");
		double length1=sc.nextDouble();
		System.out.println("enter the breadth:");
		double breadth1=sc.nextDouble();
		Box1 b2=new Box1(length1,breadth1);
		b2.display();

		System.out.println("enter the length:");
		double length2=sc.nextDouble();
		System.out.println("enter the breadth:");
		double breadth2=sc.nextDouble();
		System.out.println("enter the heigth:");
		double heigth2=sc.nextDouble();
		Box1 b3=new Box1(length2,breadth2,heigth2);
		b3.display();

	}
}