class  UserLogic{
	public static void main(String[] args){
		Mobile mobile=new Mobile("samsung",26000.0,new Battery(5000,9));
		mobile.battery.charging();
		mobile.communicate();
	}
}