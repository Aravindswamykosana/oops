class  UserBike{
	public static void main(String[] args){
		Bike22 b1=new Bike22("KTM",180.0,40.3);
		b1.travel();
		b1.ride();
		System.out.println(b1.getTopSpeed());
		System.out.println("********************");
		Bike22 b2=new Bike22("yamaha",255.0,45.3);
		b2.setTopSpeed(900.0);
		System.out.println(b2.getTopSpeed());
		b2.travel();
		b2.ride();
	}
}
