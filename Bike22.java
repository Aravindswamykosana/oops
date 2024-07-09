class  Bike22{
	String name;
	private double topspeed;
	double milage;
	public Bike22(String name,double topspeed,double milage){
		this.name=name;
		if(this.topspeed>=0.0 && topspeed<=220.0){
			this.topspeed=topspeed;
		}
		else{
			this.topspeed=220.0;
			System.out.println("according to govt r&t speed range is 220.0");
		}
		this.milage=milage;
	}
	public void setTopSpeed(double tp){
		if(tp>=0.0 && tp<=220.0){
			this.topspeed=tp;
		}
		else{
			System.out.println("enter the proper speed range:");
		}
	}
	public double getTopSpeed(){
		return this.topspeed;
	}
	public void travel(){
		System.out.println("your bike is::"+this.name);
		System.out.println("your topspeed is::"+this.topspeed);
		System.out.println("your milage is::"+this.milage);
	}
	public void ride(){
		System.out.println("u can ride anywhere");
	}
}
