class  Sample{
	public static void main(String[]args){
		int ed=0,md=0,n=12345,temp=n;
		while(n!=0){
			int r=n%10;
			if(n==temp || n<10){
				ed=ed+r;
			}
			else{
				md=md+r;
			}
			n/=10;
		}
		System.out.println(ed+" "+md);
	}
}