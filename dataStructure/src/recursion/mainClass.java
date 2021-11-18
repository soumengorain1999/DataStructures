package recursion;

public class mainClass {

	static int steps=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(sum(5));
		//System.out.println(pow(3,1000));
		//System.out.println(steps);
		//steps=0;
		//System.out.println(fastPow(3,1000));
		
		//System.out.println(steps);
		steps=0;
		System.out.println(path(2,2));
		System.out.println(steps);
	}
	
	static int pow(int n,int p)
	{
		steps++;
		if(p==0)
			return 1;
		return n*pow(n,p-1);
	}
	
	static int fastPow(int a,int b)
	{
		steps++;
		
		if(b==0)
			return 1;
		if(b%2==0)
			return (fastPow(a*a,b/2));
		
		return a*fastPow(a, b-1);
		
	}
	static int path(int m,int n)
	{
		steps++;
		if (m==1 || n==1)
			return 1;
		return path(m,n-1)+path(m-1,n);
	}

}
