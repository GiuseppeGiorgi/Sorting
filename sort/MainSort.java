package sort;

import sort.comparator.Field1Comparator;
import sort.comparator.Field2Comparator;
import sort.comparator.Field3Comparator;
import sort.sort.HeapSort;
import sort.sort.InsertionSort;
import sort.sort.MergeSort;
import sort.sort.QuickSort;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Comparator;

public class MainSort {

	public static void main(String[] args) {
		
		Comparator<Record> parametro;
		BufferedReader f = null;
		ArrayList<Record> lista = new ArrayList<Record>( );
		
		try{
			
			
			FileReader input = new FileReader("src/sort/data/file2.csv");
			f = new BufferedReader(input); 
			
			String linea ;
			
			/*
			 * per ogni record crea un oggetto record e lo inserisce in un arraylist
			 * 
			 * */
			
			while((linea = f.readLine()) != null){

				int id = Integer.parseInt(linea.split(",")[0]);
				String field1 = linea.split(",")[1];
				int field2 = Integer.parseInt(linea.split(",")[2]);
				float field3 = Float.parseFloat(linea.split(",")[3]);
				
				lista.add(new Record(id, field1, field2, field3 ));
				
			}
				

				System.out.println("*************************************");
				System.out.println("* 1) Insertion Sort                 *");
				System.out.println("* 2) Quick Sort                     *");
				System.out.println("* 3) Merge Sort                     *");
				System.out.println("* 4) Heap Sort                      *");
				System.out.println("*************************************");
				
				
				
				
				 BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in) );
	             System.out.print("Scegli algoritmo: ");
	             int algoritmo = Integer.parseInt( stdin.readLine());
	            
	             
	            	 
	        	System.out.println("*************************************");
	 			System.out.println("* 1) Field1                         *");
	 			System.out.println("* 2) Field2                         *");
	 			System.out.println("* 3) Field3                         *");
	 			System.out.println("*************************************");
	 			
	 			BufferedReader campo = new BufferedReader(new InputStreamReader(System.in) );
	            System.out.print("Scegli Campo da ordinare: ");
	            int ordine = Integer.parseInt( campo.readLine());
	            
	            
	            /*
	             * secondo il tipo di campo scelto istanzio il comparator giusto*/
	            switch (ordine) {
				case 1: parametro = new Field1Comparator();
					
					break;
				case 2: parametro = new Field2Comparator();
				
					break;
				case 3: parametro = new Field3Comparator();
				
					break;	

				default: parametro = new Field1Comparator();
					break;
				}
				 
	            
	            /*richiamo l'algoritmo scelto dall'utente
	             * i parametri sono la lista e l'istanza di comparator
	             * */ 
	            switch (algoritmo) {
				case 1:
					long inizioI = System.currentTimeMillis();
					InsertionSort.sort(lista, parametro);

					long fineI = System.currentTimeMillis();

					long totI = (fineI - inizioI)/1000;
					System.out.println(totI);


					break;
					
				case 2:

					long inizioQ = System.currentTimeMillis();

					QuickSort.sort(lista, 0, lista.size()-1, parametro);

					long fineQ = System.currentTimeMillis();

					long totQ = (fineQ - inizioQ)/1000;
					System.out.println(totQ);
					break;
				
				case 3:

					long inizioM = System.currentTimeMillis();

					MergeSort.sort(lista, 0, lista.size() - 1, parametro);

					long fineM = System.currentTimeMillis();

					long totM = (fineM - inizioM)/1000;
					System.out.println(totM);
					break;
				
				case 4:

					long inizioH = System.currentTimeMillis();

					HeapSort.sort(lista, parametro);

					long fineH = System.currentTimeMillis();

					long totH = (fineH - inizioH)/1000;
					System.out.println(totH);

					break;

				default: InsertionSort.sort(lista, parametro);
					break;
				}

				
	            /*
	             * stampo la lista dopo l'ordinamento*/
				for(Record item : lista ){
					System.out.println(item.toString());
				}
				

		}
		catch (IOException ex){
			System.out.println("Errore File");
		}
		catch(Exception e){
			System.out.println("verificato un errore");
		}
		finally {
			try{
				f.close();
			}
			catch (IOException ex){
				System.out.println("Errore chiusura file");
			}
		}
			

	}
	

}
