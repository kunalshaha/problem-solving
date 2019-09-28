package test;

import java.util.Arrays;
import java.util.List;

public class tryDiff {
	
	public static void main(String args[]) {
	int arr[] = {1, 5, 3, 4, 2};
	int diff = 2;
    int numberOfpairs =  calculateNumberofPairs(arr,diff);
    System.out.println(numberOfpairs);
    }

	private static int calculateNumberofPairs(int[] arr, int diff) {
		
		Arrays.sort(arr);
		int i=0;
		int j = 0;
		int count = 0;
		while( j< arr.length) {
			System.out.println(arr[j] - arr[i]);
			
			if(arr[j]-arr[i] == diff) {
				count++;
				i++;
				j++;
			}
			else if(arr[j] - arr[i] > diff) {
				i++;
			}else {
				j++;
			}
			
			
		}
		
		return count;
	}
	
	

}
