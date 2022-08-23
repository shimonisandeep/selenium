package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int a[] = { 6,4, 5, 56, 6, 6, 7, 8, 9, 8, 9, 0, 7 }; // String a[] = {"a","b","c","d"};
		Integer[] numbers = new Integer[]{ 1,  6,4, 5, 56, 6, 6, 7, 8, 9, 8, 9, 0, 7 } ;
		
		
		
	
		
		List<Integer> ary = Arrays.asList(numbers);
		List<Integer> ary2 =ary;
	
		
		
		for (Integer b : ary)
		{
		//	System.out.println("b = " + b);
			int j =0;
			int count = 0 ;
			for (Integer dummy : ary2)
			{
				
				
				if (b== dummy)
				{
					count ++;
					
					
				}
				
				
			}
			System.out.println("b = " + b + " count " +count );
			
		}
		
		
		/*
		 * while (it.hasNext()) {
		 * 
		 * int b = (Integer)it.next();
		 * 
		 * System.out.println("b = " + b); temp = b; System.out.println("temp " + temp);
		 * int count =0; if ( temp == b) { count ++; }
		 * 
		 * 
		 * 
		 * 
		 * j++;
		 * 
		 * System.out.println("j = " + j); }
		 */
		
		/*
		 * for (int i =0; i<= ary.size() ; i++) { //ary.indexOf(i); //List<int[]> temp =
		 * ary;
		 * 
		 * int count =0; for( int[] temp : ary ) {
		 * 
		 * if (temp.equals(ary)) { count++; System.out.print(temp);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * System.out.print("  " + count); }
		 */

		// TODO Auto-generated method stub
		/*
		 * int a[] = { 1, 6, 4, 5, 56, 6, 6, 7, 8, 9, 8, 9, 0, 7 };
		 * 
		 * // int a[] ={ 4,5,5,5,4,6,6,9,4}; // Print unique number from the list-
		 * Amazon // print the string in reverse ArrayList<Integer> ab = new
		 * ArrayList<Integer>(); for (int i = 0; i < a.length; i++) { int k = 0; if
		 * (!ab.contains(a[i])) { ab.add(a[i]); k++; for (int j = i + 1; j < a.length;
		 * j++) { if (a[i] == a[j]) { k++; } } System.out.println(a[i]);
		 * //System.out.println(k); if (k == 1) System.out.println(a[i] +
		 * " is unique number"); }
		 * 
		 * }
		 */
	}

}
