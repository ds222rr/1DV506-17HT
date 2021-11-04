package ds222rr_assign4.stack;

import java.util.Iterator;	// Get Iterator from the Java Library

public class StackMain {
	public static void main(String[] args) {
		StackClass stack = new StackClass();	// Create net StackClass Object
		System.out.println("Size of the stack: "+stack.size());			// Get Stack size
		// In case Stack is empty
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
		}
		// In case Stack is not emty
		else {
			System.out.println("Stack is not empty");
		}
		
		stack.push(10);		// Pushing an element
		System.out.println("Size of the stack: "+stack.size());		// Get Stack size
		stack.push(17);		// Pushing an element
		stack.push(45);		// Pushing an element
		stack.push(41);		// Pushing an element
		System.out.println("Size of the stack: "+stack.size());		// Get Stack size
		stack.push(35);		// Pushing an element
		
		System.out.println("Content of stack: "+stack.toString());	// print out Stack
		
		// In case Stack is empty
		if (stack.isEmpty()) {
			System.out.println("Stack is empty");
		}
		// In case Stack is not emtpy
		else {
			System.out.println("Stack is not empty");
		}
		System.out.println("Size of the stack: "+stack.size());			// Get Stack size
		System.out.println("Popping element: "+stack.pop());			// Popping an element
		System.out.println("Size of the stack: "+stack.size());			// Get Stack size
		System.out.println("Content of stack: "+stack.toString());		// print out Stack
		System.out.println("Peeking  element: "+stack.peek());			// Peeking an element
		System.out.println("Size of the stack: "+stack.size());			// Get Stack size
		
		// Check iterator
		System.out.print("Iterator: ");
		Iterator<Object> it = stack.iterator();		// Create new Iterator Object
		// Iterative statement to run through the Stack
		while (it.hasNext()) {
			Object n = it.next();		// Declare Object for the next element
			System.out.print(n + "  ");
		}
	}
}
