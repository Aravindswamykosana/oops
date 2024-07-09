import java.util.Scanner;
class  Jspy{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the phno:");
		long phno=sc.nextLong();
		System.out.println("enter the 10thpercentage:");
		double ten=sc.nextDouble();
		Jspiders j1=new Jspiders(name,phno,ten);
		j1.qualification();

		System.out.println("enter the name1:");
		String name1=sc.next();
		System.out.println("enter the phno1:");
		long phno1=sc.nextLong();
		System.out.println("enter the 10thpercentage1:");
		double ten1=sc.nextDouble();
		Jspiders j2=new Jspiders(name1,phno1,ten1);
		j2.qualification();

		System.out.println("enter the name2:");
		String name2=sc.next();
		System.out.println("enter the phno2:");
		long phno2=sc.nextLong();
		System.out.println("enter the 10thpercentage2:");
		double ten2=sc.nextDouble();
		System.out.println("enter the 12thpercentage2:");
		double twelve2=sc.nextDouble();
		Jspiders j3=new Jspiders(name2,phno2,ten2,twelve2);
		j3.qualification();

		System.out.println("enter the name3:");
		String name3=sc.next();
		System.out.println("enter the phno3:");
		long phno3=sc.nextLong();
		System.out.println("enter the 10thpercentage3:");
		double ten3=sc.nextDouble();
		System.out.println("enter the 12thpercentage3:");
		double twelve3=sc.nextDouble();
		System.out.println("enter the degree percentage3:");
		double degree3=sc.nextDouble();
		Jspiders j4=new Jspiders(name3,phno3,ten3,twelve3,degree3);
		j4.qualification();
	}
}
