class  B extends A{
	static int l;
	int j;
	public B(int i,int k,int l,int j){
		super(i,k);
		this.l=l;
		this.j=j;
		System.out.println("from sub class constructor");
	}
}
