package test;

import java.util.HashSet;
import java.util.Set;

public class mobilewalla {
	public static void main(String args[]) {
	
	String s="try this";
//	String reversed = recursiveFuntion(s);
	
	//System.out.println(reversed);
	
	String val = "abc";
	String perm = "";
	System.out.print(val.substring(0, 0));
	
	permutations(perm, val);
//	System.out.println(reversed);
	}
	
	
	
	static void permutations(String perm,String val) {
		if(val.isEmpty()) {
			System.out.println("val :: " + perm+val);
		}else {
			for(int i=0;i<val.length();i++) {
				String fixedChar = perm + val.charAt(i);
				String combination = val.substring(0,i)+val.substring(i+1,val.length());
				System.out.println("permanant char :: " + fixedChar);
				System.out.println("Combinations :: " + combination);
				permutations(fixedChar,combination);
			}
		}
		
		
	}
	
	
	static String recursiveFuntion(String s) {
		
		if(s.isEmpty()) {
			return s;
		}
		
		System.out.println(s.charAt(0));
		
		return recursiveFuntion(s.substring(1))+s.charAt(0);
	}

}
