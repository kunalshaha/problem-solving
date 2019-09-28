package test;

import java.util.Arrays;

public class MissingNumber {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,5};
		System.out.print(missingNumber(arr,5));
		
		 int[] arr1 = {1,2,2,3,5};
		 
		 
		System.out.println(removeDuplictes(arr1));
		int[] a = removeDuplictes(arr1);
		for(int i =0 ;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	static int missingNumber(int arr[],int n) {
		int totalVal = n*((n+1)/2);
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return totalVal-sum;
		
		
	}
	
	
	static int[] removeDuplictes(int arr[]) {
		
		Arrays.sort(arr);
		int prev = arr[0];
		int[] result = new int[arr.length];
		result[0] = prev;
		
		for(int i=1;i<arr.length;i++) {
			int ch = arr[i];
			
			if(prev!=ch) {
				result[i]=ch;
			}
			
			prev =ch;
			
			
		}
		return result;
	}
 
}
