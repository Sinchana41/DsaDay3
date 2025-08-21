package org.queue;

import  org.stack.*;
public class Queue<T> {

	Stack<T> stack1 = new Stack<>();
	Stack<T> stack2 = new Stack<>();

	public void enqueue(T data) {
		stack1.push(data);
	}

	public T dequeue() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			throw new RuntimeException("Queue is empty");
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
