class  Box1{
	double length;
	double breadth;
	double heigth;
	public Box1(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public Box1(double length,double breadth,double heigth){
		this(length,breadth);
		this.heigth=heigth;
	}
	public void display(){
		System.out.println("length is::"+this.length);
		System.out.println("breadth is::"+this.breadth);
		if(this.heigth!=0){
			System.out.println("heigth is::"+this.heigth);
		}

	}
}
