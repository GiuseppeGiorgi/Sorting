package sort.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class MergeSort {
	
	

	public static <T> void sort(ArrayList<T> lista, int left, int right, Comparator<? super T> c){
		
		
		//indice dell'enemento mediano
		int center;
		
		//se ci sono almeno di 2 elementi 
		if(left < right){
			
			//divido in 2 parti
			center = (left + right)/2;
			
			//chiamo la funzione per la prima meta'
			sort(lista, left, center, c);
			
			//chiamo la funzione di ordinamento per la seconda meta'
			sort(lista, (center + 1), right, c);
			
			//chiamo la funzione per la fusione delle 2 meta' ordinate
			merge(lista, left, center, right, c );
		}
		
	}
	
	private static <T> void merge(ArrayList lista, int left, int center, int right, Comparator c){

		//lista di appoggio 
		ArrayList<T> tmp = new ArrayList<T>();
		int i = left;
		int j = center + 1;

		
		//fusione delle 2 meta'
		while(i <= center && j <= right){
			
			
			
			if(c.compare(lista.get(i), lista.get(j)) <= 0){
				
				
				tmp.add((T)lista.get(i));
				i ++;
				
			}
			else{


				tmp.add((T)lista.get(j));

				
				j ++;
				
			}
			

		}
		
		
		
		//se i e' minore di center significa che alcuni elementi 
		//della prima meta' non sono stati inseriti nella lista
		while( i <= center ){
			
			tmp.add((T)lista.get(i) );
			i++;

			
		}
		
		
		//se i e' minore di center significa che alcuni elementi 
		//della prima meta' non sono stati inseriti nella lista
		while( j <= right ){
			
			tmp.add((T)lista.get(j));
			j ++;

			
		}
		
		
		for(int k = left; k <= right; k++ ){
			lista.set(k, tmp.get(k-left));
		}
		
		
	}
}
