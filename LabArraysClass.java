/*******************
* Author: Micah L
*
* Lab: Arrays
********************/

import java.util.Arrays;

public class LabArraysClass{

	public static void main(String[] args){
		int[] iArray1 = {6, 12, 3, 9};
		int[] iArray2 = new int[5];
		
		// fill iArray2 with 7
      Arrays.fill(iArray2, 7);
		
		// print iArray1 and iArray2 (toString)
      System.out.println("iArray1: " + Arrays.toString(iArray1));
      System.out.println("iArray2: " + Arrays.toString(iArray2));
		
      //search for number 9 in iArray1 and print the value returned:
      int index = Arrays.binarySearch(iArray1, 9);
      System.out.printf("9 in iArray1: %d%n", index);

		// sort iArray1 and print it
      Arrays.sort(iArray1);
      System.out.println("iArray1 sorted: " + Arrays.toString(iArray1));

	   //search for number 9 in iArray1 and print the value returned:
      int index2 = Arrays.binarySearch(iArray1, 9);
      System.out.printf("9 in iArray1: %d%n", index2);
		
		// create iArray3 and assign it the first 3 elements of iArray1; print it
      int[] iArray3 = Arrays.copyOf(iArray1, 3);
      System.out.println("iArray3: " + Arrays.toString(iArray3));
				
		// test equality of new int[] {3, 6, 9} and iArray3; print result
		System.out.println("iArray3 equals [3, 6, 9]: " 
         + Arrays.equals(iArray3, Arrays.copyOf(iArray1, 3)));
      
      //Reason for different values when using binarySearch
      System.out.println();
      System.out.println("Reason: binarySearch is looking for a specified array ");
      System.out.println("for the specified value using a search algorithm. The ");
      System.out.println("array must be sorted prior to calling binarySearch. ");
   
	}
}