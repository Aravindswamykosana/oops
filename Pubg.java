import java.util.Scanner;
class  Pubg{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter your gun brand::");
		String brand=sc.next();
		System.out.println("enter your gun bullets::");
		double nob=sc.nextDouble();
		Gun g1=new Gun(brand,nob);
		g1.shoot();
		System.out.println("**************");


		System.out.println("enter your gun brand::");
		String brand1=sc.next();
		System.out.println("enter your gun bullets::");
		double nob1=sc.nextDouble();
		Gun g2=new Gun(brand1,nob1);
		g2.shoot();
		System.out.println("**************");


		System.out.println("enter your gun brand::");
		String brand2=sc.next();
		System.out.println("enter your gun bullets::");
		double nob2=sc.nextDouble();
		Gun g3=new Gun(brand2,nob2);
		g3.shoot();
		System.out.println("**************");

	}
}