package Queue;

import com.LinkedList.MyLL.Node; 
//push from rear- Enqueue
//pop form front/head- enqueue

public class MyQueue<E> {
	
	private Node<E> head,rear;
	
	public void enqueue(E data)
	{
		Node<E> toadd=new Node(data);
		if(head==null)
		{
			head= rear= toadd;
			return;
		}
		rear.next=toadd;
		rear=rear.next;
		
		
	}
	
	public E dequeue()
	{
		
		
		if(head==null)
			return null;
		Node<E> temp=head;
		head=head.next;
		
		if(head==null)
		{
			rear=null;
		}
		
		return temp.data;
		
		
		
	}

}
