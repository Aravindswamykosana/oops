import java.util.Scanner;
class  UserClock{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args){
		/*System.out.println("enter the 12 hrs format for hours::");
		int hrs=sc.nextInt();
		System.out.println("enter the 12 hrs format for minutes::");
		int min=sc.nextInt();
		System.out.println("enter the 12 hrs format for seconds::");
		int sec=sc.nextInt();*/
		Clock c1=new Clock(10,5,45);
		c1.setHrs(7);
		c1.setMin(39);
		c1.setSec(55);
		System.out.println("hour is:"+c1.getHrs());
		System.out.println("minutes are:"+c1.getMin());
		System.out.println("seconds are:"+c1.getSec());
	}
}
