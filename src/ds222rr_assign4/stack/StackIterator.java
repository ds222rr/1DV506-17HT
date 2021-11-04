package ds222rr_assign4.stack;

import java.util.Iterator;	// Get Iterator from the Java Library

public class StackIterator implements Iterator<Object> {	// implementing the Interator Interface
	private int next = 0;
	private final int [] fields;
	private final int maximum;
	
	public StackIterator(int [] array, int maxValue) {	// Constructor
		fields = array;
		maximum = maxValue;
	}
	
	public boolean hasNext() {		// verify whether the iterator has a next element
		return next < maximum;
	}
	
	public Object next() throws IndexOutOfBoundsException {	// return the (next) object, increase next by one
		return fields[next++];
	}
}
