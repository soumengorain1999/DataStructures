package dequeue;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeQueue<Integer> dq=new DeQueue<>();
		
		dq.addToHead(5);
		dq.addToHead(10);
		dq.addToHead(17);
		System.out.println(dq.toremove());

	}

}
