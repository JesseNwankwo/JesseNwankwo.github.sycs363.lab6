package test.howard.edu.sycs363.spring15.lab4;

import static org.junit.Assert.*;
import howard.edu.sycs363.spring15.lab4.IntegerArrayList;

import org.junit.Test;

public class IntegerArrayListTest {

	@Test
	public void testAddInt() {
		  
		IntegerArrayList tester = new IntegerArrayList();
		  tester.add(1);

		   // Tests
		   assertEquals(1, tester.get(0));

		fail("Not yet implemented");
	}

	@Test
	public void testAddIntInt() {
		  
		IntegerArrayList tester = new IntegerArrayList();
		   tester.add(1);
		   tester.add(2);
		   tester.add(0,3);
		   tester.add(1,4);
		   
		   assertEquals(3, tester.get(0));
		   
		fail("Not yet implemented");
	}

	@Test
	public void testGet() {
		IntegerArrayList tester = new IntegerArrayList();
		  tester.add(1);
		  tester.add(2);
		  tester.add(3);

		   // Tests
		   assertEquals(2, tester.get(2));
		fail("Not yet implemented");
	}

	@Test
	public void testIndexOf() {
		IntegerArrayList tester = new IntegerArrayList();
		  tester.add(1);
		  tester.add(2);
		  tester.add(3);
		  assertEquals(3, tester.indexOf(2));

		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		IntegerArrayList tester = new IntegerArrayList();
		assertTrue(tester.isEmpty());
		
		fail("Not yet implemented");
	}

	@Test
	public void testDelete_Num() {
		IntegerArrayList tester = new IntegerArrayList(3);
		   tester.add(10);
		   tester.add(20);
		   tester.add(30);
		   assertEquals(20, tester.delete_Num(0));

		fail("Not yet implemented");
	}

}
