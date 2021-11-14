package CodesOnDataStructure;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		boolean isbalanced=true;
		for(int i=0;i<str.length();i++)
		{
			if(str=="")
				break;
			char c=str.charAt(i);
			if(c=='(' || c=='{' || c=='[')
			{
				stack.push(c);
			}
			if(c==')'|| c==']' || c=='}' && stack.isEmpty())
			{
				isbalanced=false;
				break;
			}
			if(c==')'|| c==']' || c=='}')
			{
				if(stack.peek()=='[' && c==']')
					stack.pop();
				else if(stack.peek()=='{' && c=='}')
					stack.pop();
				else if(stack.peek()=='(' && c==')')
					stack.pop();
				else
				{
					isbalanced=false;
					break;
				}
			}
			
		}
		if(stack.isEmpty())
		{
			if(isbalanced==true)
				System.out.println("Balanced");
			else
				System.out.println("Not balanced");
		}
		else
		{
			System.out.println("Not balanced");
		}
		

	}

}
