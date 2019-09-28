package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class trySume {
	public static void main(String args[]) {
		int arr[] = {1, 5, 7, -1,5};
			//{10, 12, 10, 15, -1, 7, 6, 
              //  5, 4, 2, 1, 1, 1};
		int sum = 6;
		
		//int pairs= numberOfpairs(arr,sum);
		//int pairs=getPairsCount(arr.length, arr, sum);
		sumUsingSet(arr,sum);
		//System.out.println(pairs);
		
	}
	
	private static void sumUsingSet(int[] arr, int sum) {
		
		Set<Integer> setVal = new HashSet<>();
		for(int number : arr) {
			int target = sum - number;
			if(!setVal.contains(target)) {
				setVal.add(number);
			}else {
				System.out.println(number+":"+target);
			}
			System.out.println(setVal.size());
		}
		
	}
	private static int numberOfpairs(int[] arr, int sum) {
		
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		int count=0;
		
		while(i<j) {
			if(arr[j]+arr[i] == sum) {
				System.out.println("pairs a"+arr[j] + "b"+arr[i]);

				count++;
				i++;
				j--;
			}else if(arr[j]+arr[i] > sum){
				j--;
			}else {
				i++;
			}
			
		}
				
		
		return count;
	}

	
	static int getPairsCount(int n,int arr[] ,int sum) 
    { 
        HashMap<Integer, Integer> hm = new HashMap<>(); 
  
        // Store counts of all elements in map hm 
        for (int i=0; i<n; i++){ 
              
            // initializing value to 0, if key not found 
            if(!hm.containsKey(arr[i])) 
                hm.put(arr[i],0); 
                  
            hm.put(arr[i], hm.get(arr[i])+1); 
        } 
        int twice_count = 0; 
  
        // iterate through each element and increment the 
        // count (Notice that every pair is counted twice) 
        for (int i=0; i<n; i++) 
        { 
            if(hm.get(sum-arr[i]) != null) 
                twice_count += hm.get(sum-arr[i]); 
  
            // if (arr[i], arr[i]) pair satisfies the condition, 
            // then we need to ensure that the count is 
            // decreased by one such that the (arr[i], arr[i]) 
            // pair is not considered 
            if (sum-arr[i] == arr[i]) 
                twice_count--; 
        } 
  
        // return the half of twice_count 
        return twice_count/2; 
    } 
}
