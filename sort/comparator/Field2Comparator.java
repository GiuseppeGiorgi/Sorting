package sort.comparator;

import sort.Record;

import java.util.Comparator;

public class Field2Comparator implements Comparator<Record> {
	
	@Override
	public int compare(Record r1, Record r2){
		int f1 = r1.getField2();
		int f2 = r2.getField2();
		
		return f2 - f1;
	}

}
