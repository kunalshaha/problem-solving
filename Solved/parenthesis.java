package test;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis {
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        
		while (sc.hasNext()) {
			String input=sc.next();
           System.out.println(checkBalanced(input));
		}
		
	}

    static boolean  checkBalanced(String expr){
              Stack<Character> stack = new Stack<>();
        for(int i=0;i<expr.length();i++){
        	char a = expr.charAt(i);
        	
        	if(a == '(' || a == '[' || a == '{') {
        		stack.push(a);
        	}
        	
        	if(a == ')' || a == ']' || a == '}') {
        		
        		if(stack.isEmpty()) {
        			return false;
        		}
        		
            	if(!isMatchingBrace(stack.pop(),a)) {
            		return false;
            	}

        		
        	}
        	
        }
        
        if(stack.isEmpty()) {
        	return true;
        }else {
        	return false;
        }
    }
    
    static boolean isMatchingBrace(char stackTop,char val){
    	
    	if(stackTop == '('&& val ==')') {
    		return true;
    		
    	}
    	
    	else if(stackTop == '['&& val ==']') {
    		return true;
    		
    	}	
    
    	else if(stackTop == '{'&& val =='}') {
    		return true;
    	}	
    
    	else
    		return false;
    	
    }
    

}
