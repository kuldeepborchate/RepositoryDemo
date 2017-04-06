package com.syn.tfs.Excel;


class A{
	
	public void a()
	{
		System.out.println("I am in A class's a method");
	}
}
public class Upcasting extends A{
	
	public void b()
	{
		System.out.println("I am in B class method");
	}
	public void a()
	{
		System.out.println("I am in B class's a mehtod");
	}
	public static void main(String... args )
	{
		A a=new Upcasting ();
		a.a();
		
	}
}

