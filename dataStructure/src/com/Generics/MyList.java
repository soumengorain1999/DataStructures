package com.Generics;

public class MyList<E,F> {
	
	E d1;
	F d2;
	
	public MyList(E d1,F d2)
	{
		this.d1=d1;
		this.d2=d2;
	}
	
	public void addDescription()
	{
		System.out.println(d1 + " "+ d2);
		
	}

}
