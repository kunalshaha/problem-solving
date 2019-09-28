package test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class unionIntersectionOfarray {
	public static void main(String args[]) {
		
		int arr1[] = {2,5,6};
		int arr2[] = {1,3,4,6,7};
		
			unionOfarrays(arr1,arr2);	
			intersectionOfArr(arr1,arr2);
		
		
		
	}
	
	static void intersectionOfArr(int []arr1,int []arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int i = 0,j=0;
		while(i<m && j<n) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr1[i]) {
				j++;
			}else {
				System.out.println(arr1[i++]);
				j++;
			}
			
			
		}
	}
	
	static void unionOfarrays(int[] arr1,int[] arr2) {
		
		Set<Integer> integerSet = new TreeSet<>();
		
		for(int i=0;i<arr1.length;i++) {
			integerSet.add(arr1[i]);
		}
		
		for(int i=0;i<arr2.length;i++) {
			integerSet.add(arr2[i]);
		}
		
		System.out.println(integerSet);
	}

}
