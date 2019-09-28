package test;

public class Anagram {
	public static void main(String args[])
	{
		String word = "army";
		String anagram = "mary";
		
		
		checkAnagram(word,anagram);
				
	}

	private static void checkAnagram(String word, String anagram) {
		char[] charArray = word.toCharArray();
		
		for(char c : charArray) {
			int index = anagram.indexOf(c);
			if(index!=-1) {
			
				anagram = anagram.substring(0, index) + 
						anagram.substring(index+1,anagram.length());
				System.out.println(anagram);
			}else {
				System.out.println("not anagram");
			}
		}}
		
		
		
	}

