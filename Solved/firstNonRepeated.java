package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class firstNonRepeated {
	public static void main(String args[]) {
		
		String s = "swiss";
		Set<Character> nonRepeatingVal = new LinkedHashSet<>();
		List<Character> repeating = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(nonRepeatingVal.contains(s.charAt(i))) {
				repeating.add(s.charAt(i));
			}else {
				nonRepeatingVal.add(s.charAt(i));
			}
		}
		
		nonRepeatingVal.removeAll(repeating);
		System.out.println(nonRepeatingVal);
		
	}

}
