class  Jspiders{
	String name;
	long phno;
	double ten,twelve,degree;
	public Jspiders(String name,long phno,double ten){
		this.name=name;
		this.phno=phno;
		this.ten=ten;
	}
	public Jspiders(String name,long phno,double ten,double twelve){
		this(name,phno,ten);
		this.twelve=twelve;
	}
	public Jspiders(String name,long phno,double ten,double twelve,double degree){
		this(name,phno,ten,twelve);
		this.degree=degree;
	}
	public void qualification(){
		System.out.println("your name is "+this.name);
		System.out.println("your phno is "+this.phno);
		System.out.println("your 10th percentage is:"+this.ten);
		if(this.twelve!=0){
			System.out.println("your 12th percentage is:"+this.twelve);
		}
		if(this.degree!=0){
			System.out.println("your degree percentage is:"+this.degree);
		}
	}
}