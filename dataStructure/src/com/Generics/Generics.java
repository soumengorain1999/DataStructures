package com.Generics;

public class Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyList<Integer,String> list=new MyList(12, "yoo");
		MyList<String, Character> l2=new MyList<String, Character>("Hey", 'y');
		
		list.addDescription();
		l2.addDescription();

	}

}
