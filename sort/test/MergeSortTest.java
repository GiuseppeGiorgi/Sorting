
package sort.test;

import org.junit.Before;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import sort.Record;
import sort.comparator.Field1Comparator;
import sort.comparator.Field2Comparator;
import sort.comparator.Field3Comparator;
import sort.sort.MergeSort;

public class MergeSortTest {
	
	ArrayList<Record> lista = new ArrayList<>();
	MergeSort sort = new MergeSort();
	
	Record uno = new Record(0, "Arrio", 3754104, Float.parseFloat("99560.485603"));
	Record due = new Record(1, "misericordia", 496325, Float.parseFloat("61628.929334"));
	Record tre = new Record(3, "piangea", 4741192, Float.parseFloat("32209.073312"));
	Record quattro = new Record(4, "quando", 4476757, Float.parseFloat("10838.641053"));
	Record cinque = new Record(5, "terra", 4271997, Float.parseFloat("4410.390699"));
	
	
	@Before
	public void setUp(){

		
		lista.add(due);
		lista.add(tre);
		lista.add(quattro);
		lista.add(uno);
		lista.add(cinque);
		
		
	}

	@Test
	public void testMsort1() {
		
		sort.sort(lista, 0, lista.size() -1, new Field1Comparator());
		
		Assert.assertEquals(uno, lista.get(4));
		Assert.assertEquals(due, lista.get(3));
		Assert.assertEquals(tre, lista.get(2));
		Assert.assertEquals(quattro, lista.get(1));
		Assert.assertEquals(cinque, lista.get(0));
		
	}

	
	
	@Test
	public void testMsort2() {
		
		sort.sort(lista, 0, lista.size() -1, new Field2Comparator());
				
		Assert.assertEquals(due, lista.get(4));
		Assert.assertEquals(uno, lista.get(3));
		Assert.assertEquals(cinque, lista.get(2));
		Assert.assertEquals(quattro, lista.get(1));
		Assert.assertEquals(tre, lista.get(0));
		
	}
	
	@Test
	public void testMsort3() {
		
		sort.sort(lista, 0, lista.size() -1, new Field3Comparator());
				
		Assert.assertEquals(cinque, lista.get(4));
		Assert.assertEquals(quattro, lista.get(3));
		Assert.assertEquals(tre, lista.get(2));
		Assert.assertEquals(due, lista.get(1));
		Assert.assertEquals(uno, lista.get(0));
		
	}
	
	
	
}

