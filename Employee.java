class  Employee{
	String name;
	private double sal;
	public Employee(String name,double sal){
		this.name=name;
		if(sal>=10000){
			this.sal=sal;
		}
	}
	public void setSal(double sal){
		if(sal>10000){
			this.sal=sal;
		}
		else{
			System.out.println("please save my employee::"+this.name);
		}
	}
	public double getSal(){
		return this.sal;
	}
}
