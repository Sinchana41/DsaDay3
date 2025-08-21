package org.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacter {

	public static char firstUniqueChar(String stream) {
		int[] frequency = new int[256]; // frequency of chars
		Queue<Character> queue = new LinkedList<>();

		for (char character : stream.toCharArray()) {
			frequency[character]++;
			queue.add(character);

			// Remove repeating chars from the front
			while (!queue.isEmpty() && frequency[queue.peek()] > 1) {
				queue.poll();
			}
		}

		if (queue.isEmpty()) {
			return '-'; 
		} else {
			return queue.peek();
		}
	}

	public static void main(String[] args) {
		String stream = "aabc";
		char result = firstUniqueChar(stream);
		if (result == '-') {
			System.out.println("No unique character found");
		} else {
			System.out.println("First unique character: " + result);
		}
	}
}
