class  UserLogicBook{
	public static void main(String[] args){
		Author author=new Author("Harry potter",10000000.0,new Book1("Classmate","pure white",500));
		author.book1.write();
		author.publishing();
	}
}
