class Flower{
	String name,color;
	int pittels;
	public Flower(){
		this.name="rose";
		this.color="red";
		this.pittels=15; //fixed properties;
	}
	public Flower(String name,String color,int pittels){
		this.name=name;
		this.color=color;
		this.pittels=pittels;
	}
	public void fragrance(){
		System.out.println("name:"+this.name+" &color is:"+this.color+" pittels is:"+this.pittels);
	}
}