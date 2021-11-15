package maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen=new Pen(10, "Blue1");
		Pen pen2=new Pen(10, "Blue1");
		
		System.out.println(pen.equals(pen2));
		Set<Pen> pens=new HashSet<Pen>();
		
		pens.add(pen);
		pens.add(pen2);
		System.out.println(pens);
		
		
		
		

	}
	
	static class Pen{
		int price;
		String color;
		
		public Pen(int price,String color)
		{
			this.color=color;
			this.price=price;
		}
		
		@Override
		public boolean equals(Object obj)
		{
			Pen that=(Pen) obj;
			
			boolean isEqual= this.price==that.price && this.color==that.color;
			return isEqual;
		}
		
		@Override
		public int hashCode()
		{
			//System.out.println(color.hashCode());
			return this.price +color.hashCode();
			
		}
		
	}

}
