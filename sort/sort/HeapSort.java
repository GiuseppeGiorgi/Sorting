package sort.sort;

import java.util.ArrayList;
import java.util.Comparator;

public class HeapSort {
	
	private static int n;
	private static int largest;
	
	//metodo heapsort
	public static <T> void sort(ArrayList<T> lista, Comparator<? super T> c){
		
		buildHeap(lista, c);
		for(int i = n; i > 0; i--){
			scambia(lista, 0, i);
			n = n-1;
			heapIfy(lista, 0, c);
		}
		
		
		
	}
	
	//buildheap, esegue heapify sull'albero per mantenere la proprieta
	private static <T> void buildHeap(ArrayList lista, Comparator c){
		
		n = lista.size()-1;
		for(int i = n/2; i >= 0; i--){
			
			heapIfy(lista, i, c);
			
		}
	
	}
	
	//heapIfy mantiene le proprieta dell heap sull'albero
	private static <T> void heapIfy(ArrayList lista, int i, Comparator c){
			int left = 2*i;
			int right = 2*i+1;
			
			if(left <= n && (c.compare(lista.get(left), lista.get(i)) > 0)){
				
				largest = left;
				
			}
			else{
				
				largest = i;
			}
			
			if(right <= n && (c.compare(lista.get(right), lista.get(largest)) > 0)){
				
				largest = right;
				
			}
			if(largest != i){
				
				scambia(lista, i, largest);
				
				heapIfy(lista, largest, c);
				
			}
		}
	
	//scambia gli elementi
	private static <T> void scambia (ArrayList<T> lista,int i, int j){
		
		T tmp = lista.get(i);
		lista.set(i, lista.get(j));
		lista.set(j, tmp);
		
	}
	

}
