package dequeue;

import java.security.PublicKey;

public class DeQueue<E> {

	Node<E> head,tail;
	
	public void addToHead(int data)
	{
		Node<E> temp=head;
		Node<E> toadd=new Node(data);
		if(head==null)
		{
			head=tail=toadd;
			return;
		}
		head.next=toadd;
		toadd.prev=head;
		head=toadd;
		
		
		
	}
	
	public E toremove()
	{
		Node<E> temp=tail;
		
		if(head==null)
			return null;
		
		tail=tail.next;
		tail.prev=null;
		if(tail==null)
			head=null;
		return temp.data;
	}
	
	public static class Node<E>
	{
		E data;
		Node<E> next,prev;
		
		public Node(E data)
		{
			this.data=data;
			this.next=this.prev=null;
		}
		
		
	}
}
