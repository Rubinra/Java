package javacollection;

import java.util.PriorityQueue;

public class preQue {

	public static void main(String[] args) {
		
		PriorityQueue<String> quu = new PriorityQueue<>();
		quu.add("Amit Sharma");  
		quu.add("Vijay Raj");  
		quu.add("JaiShankar");  
		quu.add("Raj");
		System.out.println("head:\t"+quu.element());
		System.out.println("head:\t"+quu.peek());
	//to iterate the queue elements
		System.out.println();
		System.out.println("*Iterate the elements in the Queue");
		for(Object ob : quu) {
			System.out.println(ob);
		}
		//to remove the Queue elements
		quu.remove();
		quu.poll();
		System.out.println();
		System.out.println("After removing two elements");
		for(Object re :quu) {
			System.out.println(re);
		}
	

	}

}
