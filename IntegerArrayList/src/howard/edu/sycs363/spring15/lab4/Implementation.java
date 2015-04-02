/**
 * 
 */
package howard.edu.sycs363.spring15.lab4;

import howard.edu.sycs363.spring15.lab4.IntegerArrayList;


public class Implementation {
	IntegerArrayList list_A;
	IntegerArrayList list_B;
	/**
	 * 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			IntegerArrayList list_A = new IntegerArrayList(); //default list
			IntegerArrayList list_B = new IntegerArrayList(3); //user made list
			list_A.add(10);
			list_A.add(20);
			list_A.add(30);
			list_B.add(1);
			list_B.add(2);
			list_B.add(3);
			
			System.out.println("Value of the Element in list_A is: " + list_A.get(1));
			
			int removed = list_A.delete_Num(0);
			System.out.println("You deleted: " + removed);
			list_B.add(0,20);
			list_B.add(0,20);
			list_B.add(1,5);
			if(list_B.isEmpty()) {
				System.out.println("Array B is empty");
			}
			else {
				System.out.println("Array B is not empty");
			}
			int number = 5;
			System.out.println("The index of " + number + " is " + list_B.indexOf(number) + " in list B");
			list_A.delete_Num(7);
			list_B.add(13, 11);

	}

}
