//import java.util.Scanner;
class  Garden{
	//static Scanner sc =new Scanner(System.in);
	public static void main(String[] args){
		Flower f1=new Flower();
		f1.fragrance();
		Flower f2=new Flower();
		f2.fragrance();
		/*System.out.println("enter the flower name:");
		String name=sc.next();
		System.out.println("enter the flower colour:");
		String colour=sc.next();
		System.out.println("enter the flower pittels:");
		int pittels=sc.nextInt();*/
		Flower f3=new Flower("lilly","white",15);
		f3.fragrance();
	}
}
