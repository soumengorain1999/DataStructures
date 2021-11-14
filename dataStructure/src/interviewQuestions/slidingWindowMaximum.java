package interviewQuestions;

import java.util.Deque;
import java.util.LinkedList;

public class slidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		
		int a[]= {4,3,1,2,5,3,4,7,1,9};
		int ans[]=s.maxSlidingWindow(a, 4);
		
		for(int num: ans)
		{
			System.out.println(num);
		}

	}
	
	static class Solution{
		
		public int[] maxSlidingWindow(int a[],int k) {
			
			int n=a.length;
			Deque<Integer> dq=new LinkedList<Integer>();
			
			int ans[]=new int[n-k+1];
			int i=0;
			
			for(;i<k;i++)
			{
				while(!dq.isEmpty() && a[dq.peekLast()]<a[i])
				{
					dq.removeLast();
				}
				dq.addLast(i);
			}
			
			//System.out.println(i);
			
			for(;i<n;i++)
			{
				ans[i-k]=a[dq.peekFirst()];
				
				while(!dq.isEmpty() && dq.peekLast()<=(i-k))
				{
					dq.removeLast();
				}
				while(!dq.isEmpty() && a[dq.peekFirst()]<a[i])
				{
					dq.removeLast();
				}
				dq.add(i);
			}
		ans[i-k]=dq.peekFirst();
			
			return ans;
		}
	}

}
