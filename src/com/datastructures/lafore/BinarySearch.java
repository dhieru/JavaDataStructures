package com.datastructures.lafore;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr [] =  {10,30,40,40,40,40,40,40,50,60,70,80};
		int element = 40;
		int size = arr.length;
		int low = 0;
		int high = size-1;
		//int mid = (low+high)/2;
		//int index = binarySearch(arr, low,high, element);
		//System.out.println("the element is found at the index ::"+index);
		boolean searchFirst = false;
		int firstIndex = binarySearchIterative(arr, low,high, element,searchFirst);
		System.out.println("Iterative the element is found at the index ::"+firstIndex);
	}
	
	private static int binarySearch(int [] arr, int low, int high, int element){
		if(low > high) return -1;
		else {
			int mid = (low+high)/2;
			System.out.println(arr[mid]);
			if (element == arr[mid]){
				System.out.println("the elemet ins rqual");
				return mid;
			} else if(element > arr[mid]){
				System.out.println(element + " " + arr[mid] );
				low = mid+1;
				return binarySearch(arr,low,high, element);
			}else {
				System.out.println(element + " " + arr[mid] );
				high = mid-1;
				return binarySearch(arr,low,high, element);
			}
		}
	}
	
	private static int binarySearchIterative( int arr[],int low, int high, int element, boolean searchFirst){
		
		int result = -1;
		while(low <= high){
			int mid = (low + high)/2;
			System.out.println(low+" "+high);
			if(element == arr[mid]){
				result = mid;
				System.out.println(result);
				if(searchFirst){
					System.out.println(mid);
					high = mid -1;
					System.out.println(high);
				}
				else
					low = mid+1;
			}else if (element > arr[mid]){
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return result;
	}
}
