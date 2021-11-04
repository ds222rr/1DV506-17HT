package ds222rr_assign4.stack;

import java.util.Iterator;	// Get Iterator from the Java Library

public class StackClass implements Stack {	// implementing the Stack Interface
	private int maxSize = 2;					// maximum size of the Stack
	private int [] data;						// Array for the elements of the Stack
	private int currentSize = 0;				// current Size of the Stack
			
	public StackClass() {					// Constructor
		data = new int[maxSize];				// array for the Stack-elements
	}

	public int size() {						// Get the current Size of the Stack
		return currentSize;
	}


	public boolean isEmpty() {				// Verify whether a Stack is empty or not
		// In case the Stack is empty
		if (currentSize == 0) {
			return true;
		}
		// In case the Stack is not empty
		else {
			return false;
		}
	}

	public void push(Object element) {			// To add a new element to the stack
		// In case the maximum size is reached
		if (currentSize == maxSize) {
			resize();
		}
		data[currentSize++] = (int) element;		// add new element to the Stack and increase the size of the Stack
	}


	public Object pop(){							// Pop an element from the Stack
		// In case Stack is not empty
		if (currentSize > 0) {
			Object next = data[currentSize-1];			// Get the latest element of the Stack
			data[currentSize--] = 0;					// Set the last element to 0 and decrease the size of the Stack
			return next;
		}
		// In case Stack is empty
		else {
			throw new IndexOutOfBoundsException();
		}
	}


	public Object peek() throws IndexOutOfBoundsException {	// Peek an element of the Stack, throw exception if Stack is empty
		Object next = data[currentSize-1];						// Get the latest element of the Stack
		return next;
	}


	public Iterator<Object> iterator() {
		return new StackIterator(data, currentSize);
	}
	
	public String toString() {						// To convert the Array to a String
		StringBuilder sb = new StringBuilder();			// Create new StringBuilder Object
		sb.append("[");
		for (int i = 0; i < currentSize; i++) {
			if (i != currentSize-1) {
				sb.append(data[i]+", ");
			}
			else {
				sb.append(data[i]);
			}		
		}
		sb.append("]");
		String str = sb.toString();
		return str;
	}
	
	private void resize() {							// To increase the size of the Array
		maxSize = 2 * maxSize;
		int [] temp = new int [maxSize];
		// Iterative statement to copy the array 
		for (int i = 0; i < currentSize; i++) {
			temp[i] = data[i];
		}
		data = temp;	// Assign the reference of temp to data
	}
}
