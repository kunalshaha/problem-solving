package test;

public class largestContiguousSu {
	
	public static void main(String args[]) {
		int [] arr1 =  {-2, -3, 4, -1, -2, 1, 5, -3};
		findContiguosSum(arr1);
	}
	
	static void findContiguosSum(int []arr1){
		int maxVal = Integer.MIN_VALUE;
		int current_sum = 0;
		for(int i=0;i<arr1.length;i++) {
			current_sum = current_sum + arr1[i];
			
			if(current_sum < 0) {
				current_sum = 0;
			}
			
			if(maxVal<current_sum) {
				maxVal = current_sum;
			}
			
		}
		System.out.println(maxVal);
	}
	
	

}
