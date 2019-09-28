package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortingOnFrequency {
	
	
	public static void main(String args[]) {
		
		String[] words = {"abc","pqr","ttt","ttt","ttt","abc"};
		Map<String,Integer> mapOfwords = new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(mapOfwords.get(words[i])!=null){
				mapOfwords.put(words[i],mapOfwords.get(words[i])+1);
			}else {
				mapOfwords.put(words[i],1);
			}
			
		}
		
		List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(mapOfwords.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue() ==  o2.getValue())
					return 0;
				else if(o1.getValue() >  o2.getValue())
					return -1;
					else return 1;
			}
		});
		
		System.out.println(list);
		
		
	}

	private static Comparator<? super Entry<String, Integer>> comparingByValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
