package org.queue;

public class MainQueue {

	public static void main(String[] args) {
		Queue<Integer>  queue= new Queue<Integer>();

		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println(queue.dequeue()); // 10
		System.out.println(queue.dequeue()); // 20
		System.out.println(queue.dequeue()); // 30
		System.out.println(queue.isEmpty()); // true
	}
}

