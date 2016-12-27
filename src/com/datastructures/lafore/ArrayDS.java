package com.datastructures.lafore;

public class ArrayDS {
	public static void main(String[] args) {
		int [] arr = {77,99,44,55,22,88,11,0,66,33};
		int nElems = arr.length;
		int j;
		int searchKey;
		
		// display the array
		for(int temp : arr){
			System.out.println(temp);
		}
		
		searchKey = 66;
		
		for( j =0;j < nElems;j++){
			if(arr[j] == searchKey)
				break;
		}
		// searching the element
		if( j == nElems) System.out.println("Can't find the search key "+searchKey);
		else System.out.println("Found the number "+ searchKey+" at location "+j);
		
		// deleting an element
		 searchKey = 55;
		 for(j =0; j < nElems; j++){
			 if(arr[j] == searchKey){
				 break;
			 }
		 }
		 
		 for(int k = j; k < nElems-1;k++){
			 arr[k] = arr[k+1];
		 }
		 nElems--;
		 
		 // display the number
		 for(int temp : arr){
				System.out.println(temp);
			}
	}
}
