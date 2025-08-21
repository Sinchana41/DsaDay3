package org.queue;

public class MainCircularQueue {

	  public static void main(String[] args) {
	        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(3);

	        circularQueue.enqueue(10);
	        circularQueue.enqueue(20);
	        circularQueue.enqueue(30);
	        System.out.println(circularQueue.enqueue(40)); // false, full

	        System.out.println("Front: " + circularQueue.Front()); // 10
	        System.out.println("Rear: " + circularQueue.Rear());   // 30

	        circularQueue.dequeue(); // removes 10
	        circularQueue.enqueue(40);

	        System.out.println("Front: " + circularQueue.Front()); // 20
	        System.out.println("Rear: " + circularQueue.Rear());   // 40
	    }
}
