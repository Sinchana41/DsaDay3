package org.queue;

import org.stack.*;

public class CircularQueue<T> {

	Stack<T> stack1;
	Stack<T> stack2;
	int capacity;
	int size;

	public CircularQueue(int k) {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
		capacity = k;
		size = 0;
	}

	public boolean enqueue(T data) {
		if (isFull()) {
			System.out.println("Queue is full!");
			return false;
		}
		stack1.push(data);
		size++;
		return true;
	}

	public boolean dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return false;
		}
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		stack2.pop();
		size--;
		return true;
	}

	public T Front() {
		if (isEmpty())
			return null;

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	public T Rear() {
		if (isEmpty()) 
			return null;

		if (!stack1.isEmpty()) {
			return stack1.peek();
		} else {
			return stack2.firstElement(); // bottom of stack2
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean isFull() {
		return size == capacity;
	}
}
