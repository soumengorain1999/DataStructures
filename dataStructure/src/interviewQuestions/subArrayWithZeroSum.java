package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class subArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,7,7,6,6,1,2,-3};
		
		Set<Integer> set=new HashSet<>();
		int sum=0;
		int k=5;
		boolean iszero=false;
		//set.add(0);
		set.add(k);
		for(int i:arr)
		{
			
			set.add(sum);
			
			sum+=i;
			//set.add(sum);
			if(set.contains(sum-k))
			{
				iszero=true;
				break;
			}
			
			
			
		}
		
			System.out.println("Possible "+iszero);


	}
}
