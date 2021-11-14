package vectorAndStacks;

import com.LinkedList.MyLL;

public class MyStack<E> {
	
	private MyLL<E> list=new MyLL<>();
	
	public void push(E data)
	{
		list.add(data);
	}
	
	public E pop() throws Exception
	{
		if(list.isEmpty())
		{
			throw new Exception("This operation is not allowed. You are trying to pop from an empty stack");
		}
		return list.removelast();
	}
	public E peek() throws Exception
	{
		if(list.isEmpty())
			throw new Exception("Empty stack. cannot peek");
		return list.getlast();
	}

}
