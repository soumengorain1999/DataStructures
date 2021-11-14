package com.LinkedList;

public class MyLL<E> {
	
	Node<E> head;
	
	public void add(E data)
	{
		Node<E> toadd=new Node<E>(data);
		if(isEmpty())
		{
			head=toadd;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
			temp=temp.next;
		
		temp.next=toadd;
	}
	
	public E getlast() throws Exception
	{
		
		Node<E> temp=head;
		
		if(temp==null)
		{
			throw new Exception("cannot remove element from an empty stack");
			
			
		}
		
		while(temp.next!=null)
			temp=temp.next;
		return temp.data;
		
	}
	
	public E removelast() throws Exception 
	{
		Node<E> temp=head;
		
		if(temp==null)
		{
			throw new Exception("cannot peek element from an empty stack");
			
			
		}
		
		if(temp.next==null)
		{
			Node<E> toremove=head;
			head=null;
			return toremove.data;
		}
		
		while(temp.next.next!=null)
			temp=temp.next;
		Node<E> toremove=temp.next;
		temp.next=null;
		return toremove.data;
		
	}
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		return false;
	}
	
	public void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
	}
	
	public static class Node<E>{
		public E data;
		public Node next;
		
		public Node(E data)
		{
			this.data=data;
			next=null;
		}
	}
}
