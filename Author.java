class  Author{
	String title;
	double price;
	Book1 book1;
	public Author(String title,double price,Book1 book1){
		this.title=title;
		this.price=price;
		this.book1=book1;
	}
	public void publishing(){
		//this.book1.write();
		System.out.println("now we can read novels.!.from Author.!");
		System.out.println("the title is:"+this.title+" and  price is:"+this.price);
		System.out.println(this.book1);
	}
}
