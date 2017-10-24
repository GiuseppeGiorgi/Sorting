/*
 * implementa comparator
 * che riceve 2 oggetti e li confronta
 * restituisce un intero <,= o > di zero
 * */
package sort.comparator;

import sort.Record;

import java.util.Comparator;

public class Field1Comparator implements Comparator<Record>{
	
	@Override
	public int compare(Record r1, Record r2){
		String f1 = r1.getField1();
		String f2 = r2.getField1();
		
		return f2.compareTo(f1);
	}

}
