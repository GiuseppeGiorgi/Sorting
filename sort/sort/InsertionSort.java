/*riceve come parametri
 * ArrayList
 * istanza Comparator*/
package sort.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class InsertionSort {

	
	public static <T> void sort (ArrayList<T> l, Comparator<? super T> c){
			
		for(int i=1; i< l.size(); i++){
		
			T value = l.get(i);
			
			int j = i-1;
			/*
			 * tramite comparator controlla se get(j) � <,=, > di value*/
			while( j >= 0 && (c.compare( l.get(j), value ) >0 ) ){
				
				// sposta i dati
				l.set(j+1, l.get(j));
				j--;
				
			}
			
			l.set(j+1, value);
		
		}
				
	}
	
}
