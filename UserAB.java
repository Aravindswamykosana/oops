class UserAB{
	public static void main(String[] args){
		System.out.println("Hello World!");
		Object obj=new B(10,20,30,40);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		//System.out.println(obj.i);
		//System.out.println(obj.j);
		A obj1=((A)obj);
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		System.out.println(obj1.i);
		System.out.println(obj1.k);
		obj1.hi();
		
		B obj2=((B)obj1);
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		System.out.println(obj2.i);
		System.out.println(obj2.k);
		System.out.println(obj2.l);
		System.out.println(obj2.j);
	}

}
