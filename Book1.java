class Book1{
	String brand,type;
	int nop;
	public Book1(String brand,String type,int nop){
		this.brand=brand;
		this.type=type;
		this.nop=nop;
	}
	public void write(){
		System.out.println("we can write anything..!.from Book1.!");
		System.out.println("the brand is:"+this.brand+" and type is:"+this.type);
	}
}
