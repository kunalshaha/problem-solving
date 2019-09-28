package test;

import java.util.HashSet;
import java.util.Set;

public class firstOccurunceofElement {
	public static void main(String args[]) {
		int [] elements = {2,4,10,10,10,18,20};
		Set<Integer> setOfnorepeatingEle = new HashSet<>();
		int index = -1;
		for(int i=elements.length-1;i>=0;i--) {
			int val = elements[i];
			if(setOfnorepeatingEle.contains(val)) {
				index=i;
			}else{
				setOfnorepeatingEle.add(val);
			}
		}
		System.out.println(index);
		
		}

}
