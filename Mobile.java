class  Mobile{
	String brand;
	double price;
	Battery battery;
	public Mobile(String brand,double price,Battery battery){
		this.brand=brand;
		this.price=price;
		this.battery=battery;
	}
	public void communicate(){
		//this.battery.charging();
		System.out.println("hello....!.from moblie blue print.!");
	}
}
