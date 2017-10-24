package sort.comparator;

import sort.Record;

import java.util.Comparator;

public class Field3Comparator implements Comparator<Record>{
	
	@Override
	public int compare(Record r1, Record r2){
		Float f1 = r1.getField3();
		Float f2 = r2.getField3();
		
		return f2.compareTo(f1);
	}

}
