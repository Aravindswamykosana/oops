//import java.util.Scanner;
class  Fact{
	public static void main(String[]args){
		int space=2,n=1,col=1;
		for(int i=1;i<=5;i++) {
			n=i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=col;j++) {
				if(j<=col/2) {
					System.out.print(n--);
				}
				else {
					System.out.print(n);
				}
			}
			System.out.println();
			if(i<=2) {
				space--;col+=2;
			}
			else {
				n=n-2;
				space++;col-=2;
			}
		}
		/*int n=6239247,rev=0;
			while(n!=0){
				int r=n%10;
				rev=rev*10+r;
				n/=10;
			}
			int sum=rev%10;
			rev/=10;
			while(rev!=0){
				int r1=rev%10;
				sum+=r1;
				int k=sum;
				int r2=0;
				while(k!=0){
					int r3=k%10;
					r2=r2*10+r3;
					k/=10;
				}
				if(sum==r2){
					System.out.println(sum);
					rev/=10;
				}
			}*/
	}
			
}
