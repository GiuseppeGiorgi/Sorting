package sort.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort {
	
	
	/*
	 * Riceve un array list
	 * inizio dell'array da confrontare
	 * la fine dell'array
	 * e l'istaza a comparator*/
	public static <T> void sort(ArrayList<T> lista, int left, int right, Comparator< T> c){
			
			/*
			 * partiziona la lista
			 * inserendo a destra del pivot quelli maggiori
			 * a sinistra quelli minori uguali al pivot*/
			int index = partition(lista, left, right, c);
			
			/*
			 * richiama ricorsivamente il quicksort
			 * sia a destra che a sinistra del pivot
			 * */	
			if(left < index-1){
				sort(lista, left, index-1, c);
			}
			if(index < right){
				sort(lista, index, right, c);
			}
			
	}
	
	
	private static <T> int partition (ArrayList lista, int left, int right, Comparator c){
		
		
		T tmp ;
		int l = left;
		int r = right;
		
		T pivot = (T)lista.get((l + r) / 2);

		/*
		 * usa comparator per confrontare a ogni giro i dati*/
		while (l <= r ){
			while(c.compare(lista.get(l), pivot) < 0){
				l++;
				
			}
			while(c.compare(lista.get(r), pivot) > 0){
				r --;
			}
			
			if(l <= r){
				tmp = (T)lista.get(l);
				lista.set(l, lista.get(r));
				lista.set(r, tmp);
				
				l++;
				r--;
				
				
			}
		}
		
		
		return l;
	}

}
