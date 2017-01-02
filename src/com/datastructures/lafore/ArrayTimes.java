package com.datastructures.lafore;

import java.util.HashMap;
import java.util.Map;

public class ArrayTimes {
	public static void main(String[] args) {
		char[] arr = {'a','b','c','d','a','b','a','b','a','a'};
		int size = arr.length;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		System.out.println(size);
		for(int i =0; i < size;i++){
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				System.out.println(count);
				count += 1;
				map.put(arr[i], count);
			}
			System.out.print(arr[i]);
			map.put(arr[i],1);
		}
		int max =1;
		int maxChar = 'a';
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		/*for(int j =0; j < map.size();j++){
			if(map.iter().get()> max){
				max = map.get(arr[j]);
				maxChar = arr[j];
			}
		}*/
		System.out.println(maxChar + " "+max);
	}
}
