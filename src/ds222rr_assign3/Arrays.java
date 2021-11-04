package ds222rr_assign3;

public class Arrays {
	public static void main(String[] args) {
		
		// Declare Array 'arr'
		int [] arr = {3,4,5,6,7};
		
		// Method 1 printout
		System.out.println("Sum of all elements of arr:\t\t"+sum(arr));
		
		// Method 2 printout
		System.out.println("\nContent of the array (arr):\t\t"+intToString(arr));
		
		// Method 3 Array declaration and printout
		int nOne = 2;	// Number added to all elements of arr
		int [] arrPlusN = addNToNewArray(arr, nOne);
		System.out.println("\nNew array (arr+"+nOne+") content:\t\t"+intToString(arrPlusN));
		
		// Method 4 Array declaration and printout
		int [] arrReversed = reverseArray(arr);
		System.out.println("\nNew array (reversed array) content:\t"+intToString(arrReversed));
		
		// Method 5 Variable declaration and printout
		int nTwo = 5;	// Number to be verified whether arr contains it
		boolean contains = hasN(arr,nTwo);
		// In case 'arr' contains nTwo
		if (contains) {
			System.out.println("\nThe array 'arr' contains:\t\t"+nTwo);
		}
		// In case 'arr' does not contain nTwo
		else {
			System.out.println("\nThe array 'arr' does not contain:\t"+nTwo);
		}
	
		// Method 6 printout
		int old = 5;	// old value
		int nw = 9;		// new value, replaces old value old
		replaceAll(arr,old,nw);
		System.out.println("\nArray 'arr' content after replacement ("+old+" by "+nw+"):\t"+intToString(arr));
		
		// Method 7 Array declaration and printout
		int [] sortedArray = sort(arr);
		System.out.println("\nNew array (sorted array) content after sorted:\t"+intToString(sortedArray));
		
		// Method 8 Array and Variable declaration and printout
		int [] sub = {4,9,6};	// Substring to be verified whether Array 'arr' contains it
		boolean hasSubSeq = hasSubsequence(arr,sub);
		// In case 'arr' contains sub
		if (hasSubSeq) {
			System.out.println("\nThe array 'arr' contains the substring:\t\t"+intToString(sub));
		}
		// In case 'arr' does not contain sub
		else {
			System.out.println("\nThe array 'arr' does not contain the substring:\t"+intToString(sub));
		}	
	}
	
	
	/*   M E T H O D S   */
	
	// Method 1: adding all elements of the array arr and returning the sum. 
	public static int sum(int[] arr) {
		int result = 0;
		// Iterative statement to add all elements of 'arr'
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}
	
	// Method 2: creating a string containing a nice-looking print out of the content of the array.
	public static String intToString(int [] arr) {
		StringBuilder sb = new StringBuilder();	// Create new StringBuilder
		sb.append("[");	// append opening bracket to sb
		// Iterative statement to append all elements of 'arr' to sb
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			// In case another element follows after the actual one
			if (i < arr.length-1) {
				sb.append(" ");	// add space if the actual element is not the last one
			}
		}
		sb.append("]");	// append closing bracket to sb
		String str = sb.toString();
		return str;
	}
	
	// Method 3: creating and returning a new array, where n have been added to all elements in arr. Array arr should be left unchanged
	public static int[] addNToNewArray(int [] arr, int nOne) {
		int [] newArray = new int[arr.length];
		// Iterative statement to copy  the values of 'arr' to 'newArray' added by nOne
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i]+nOne;
		}
		return newArray;
	}
	/* Method 4:  creating and returning a new array, consisting of all elements in arr in reverse order. 
	   Array arr should be left unchanged */
	public static int[] reverseArray(int [] arr) {
		int [] reversedArray = new int [arr.length];
		// Iterative statement to copy the values of 'arr' to 'reversedArray' in reversed order
		for (int i = arr.length-1; i >= 0; i--) {
			reversedArray[arr.length-1-i] = arr[i];
		}
		return reversedArray;
	}
	
	// Method 5:  returning true if n is contained in the array arr, false otherwise
	public static boolean hasN(int [] arr, int n) {
		// Iterative statement to determine whether 'arr' contains n
		for (int i = 0; i < arr.length; i++) {
			// In case the current(i) element equals n
			if (arr[i] == n) {
				return true;
			}
		}
		return false;
	}
	
	// Method 6:  replacing all occurrences of old with nw in arr
	public static void replaceAll(int [] arr, int old, int nw) {
		// Iterative statement to replace all elements that equals old by nw
		for (int i = 0; i < arr.length; i++) {
			// In case the current(i) element equals the value of old
			if (arr[i] == old)
				arr[i] = nw;
		}
	}
	/* Method 7:  returning a new sorted array (increasing order), containing the same set of integers as arr. 
	   Array arr should be left unchanged */
	public static int [] sort(int [] arr) {
		int [] sortArr = new int [arr.length];
		// Iterative statement to copy the values of arr to sortArr
		for (int h = 0; h < arr.length; h++) {
			sortArr[h] = arr[h];
		}
		// Iterative statements to sort the array 'sortArray'
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				// In case the current(j) element is larger than the following(j+1) element of 'sortArr'
				if (sortArr[j] > sortArr[j+1]) {
					int store = sortArr[j];		// copy current(j) element to 'store'
					sortArr[j] = sortArr[j+1];	// assign the value of the following(j+1) element to the current(j) element
					sortArr[j+1] = store;		// assign the stored value to the following(j+1) element
				}
			}
		}
		return sortArr;
	}
	// Method 8:  returning true if the sequence sub is a subsequence of array arr
	public static boolean hasSubsequence(int [] arr, int [] sub) {
		boolean contain = false;
		// Iterative statements to examine the array 'sortArray'
		for (int i = 0; i < arr.length-sub.length+1; i++) {			
			for (int j = 0; j < sub.length; j++) {
				// In case current(j+i) element of 'arr' is not equal to current(j) element of sub
				if (arr[j+i] != sub[j]) {
					contain = false;
					break;
				}
				// In case current(j+i) element of 'arr' is equal to current(j) element of sub
				else {
					contain = true;
				}					
			}
			if (contain) {
				return true;
			}
		}	
	return false;
	}
}
