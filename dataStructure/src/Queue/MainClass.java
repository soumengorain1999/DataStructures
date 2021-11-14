package Queue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> q=new MyQueue<>();
		
		q.enqueue(3);
		q.enqueue(10);
		q.enqueue(34);
		q.enqueue(334);
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

	}

}
