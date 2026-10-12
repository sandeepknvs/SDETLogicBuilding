package day3.InterestingStringManipulationProgram;

import java.util.Stack;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "1110100";
		  //StringBuilder sb = new StringBuilder(str);
		  Stack<Character> st = new Stack<>();
		  st.push(' ');
	      
	      for(char c: str.toCharArray())
	      {
	 
	    	  if(st.peek() == '1'&& c=='0')
	    	  {
	    		  st.pop();	
	    		  continue;
	    	  }
	    	  else
	    	  {
	    		  st.push(c);
	    	  }
	      }
	      
	      st.remove(0);

	        System.out.println(st);

	}

}
