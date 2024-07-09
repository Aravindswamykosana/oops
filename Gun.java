class  Gun{
	String brand;
	double nob;
	public void shoot(){
		for(int i=1;i<=this.nob;i++){
			System.out.println("shoot.....!");
		}
	}
	public Gun(String brand,double nob){
		this.brand=brand;
		this.nob=nob;
	}
}
