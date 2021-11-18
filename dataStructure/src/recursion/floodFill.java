package recursion;

public class floodFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,1,1,1,1,1,1,1},
					{1,1,1,1,1,1,0,0},
					{1,0,0,1,1,0,1,1},
					{1,2,2,2,2,0,1,0},
					{1,1,2,2,2,0,1,0},
					{1,1,1,2,2,2,2,0},
					{1,1,1,1,1,2,1,1},
					{1,1,1,1,1,2,2,1},
		};
		
		tofill(a,4,3,3,2);
		print(a);
		
	}
	
	static void tofill(int a[][],int r,int c,int fill,int prev)
	{
		int row=a.length;
		int col=a[0].length;
		if(r < 0 || c < 0 || r>=row || c>=col )
			return;
		if(a[r][c]!=prev)
			return;
		a[r][c]=fill;
		tofill(a,r-1,c,fill,prev);
		tofill(a,r,c-1,fill,prev);
		tofill(a,r+1,c,fill,prev);
		tofill(a,r,c+1,fill,prev);
	}
	static void print(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}
