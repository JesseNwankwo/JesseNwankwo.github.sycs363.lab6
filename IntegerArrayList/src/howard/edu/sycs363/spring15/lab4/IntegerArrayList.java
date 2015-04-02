/**
 * 
 */
package howard.edu.sycs363.spring15.lab4;

/**
 * @author Jesse Nwankwo
 * 
 * Driver class for the IntegerArrayList class
 *
 */
public class IntegerArrayList {

	int[] a_List; //makes an array
	int list_Index; //
	int max; //
	int num_Removed; //
	/**
	 * Constructor for IntegerArrayList 
	 * Creates array of size 7
	 */
	public IntegerArrayList() {
		a_List = new int[7]; //array of size 10
		list_Index = 0;
		max = 7;
		
	}
	/**
	 * Constructor for IntegerArrayList
	 * User creates size of array
	 * @param size
	 */
	public IntegerArrayList(int size) {
		a_List = new int[size];
		list_Index = 0;
		max = size;
	}
	/**
	 * Adds an integer value to the end of the list/array
	 * adds users value to index 0
	 * @param value
	 */
	public void add(int value) {
		if(list_Index < max) { 
			a_List[list_Index] = value;
			list_Index++;
		}
		else {
			System.out.println("Array is full!!");
		}
	}
	/** 
	 * Insert an integer value at the specified index
	 * User adds any value to the index of their choice
	 * @param index
	 * @param value
	 */
	public void add(int index, int value) {
		if(index < max)
			a_List[index] = value;
		else
			System.out.println("Invalid, try again!");
	}
	/** Return the integer value at the specified index
	 * returns -1 if the index has no value 
	 * @param index
	 * @return a_List[index] OR -1
	 */
	public int get(int index) {
		if(a_List[index] != 0) {
			return a_List[index];
		}
		else
			return -1;
	}
	/**
	 * Return the integer value at the specified index
	 * finds and returns the value at a specified index
	 * returns -1 if index is not valid
	 * @param value
	 * @return i (or -1)
	 */
	public int indexOf(int value) {
		for(int i = 0; i < a_List.length; i++) {
			if(value == a_List[i])
				return i;
		}
		return -1;
	}
	/**
	 * Checks to see if the ArrayList is empty
	 * Return true if the list/array is empty, else false
	 * @return true or false
	 */
	public boolean isEmpty() {
		if(a_List.length != 0)
			return false;
		else
			return true;
	}
	/**
	 * Remove and return the value from the specified index in the list/array.
	 * @param index
	 * @return num_Removed
	 */
	public int delete_Num(int index) {
		if(index >= 0 && index < max) {
			num_Removed = a_List[index];
			a_List[index] = 0;
			return num_Removed;
		}
		else {
			System.out.println("Invalid! Try again!");
			return -1;
		}
	}

}
