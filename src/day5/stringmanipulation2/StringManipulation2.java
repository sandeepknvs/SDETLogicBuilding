package day5.stringmanipulation2;

public class StringManipulation2 {
	//input = "sandhya@123 venkatram#456";
	//o/p:- "sandhya venkataram 21(1+2+3+4+5+6)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc!@#$";
		StringBuilder sb = new StringBuilder("");
		int i1 = 0;
		for(int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if(Character.isAlphabetic(c))
			{
				sb.append(c);
			}
			if(Character.isDigit(c))
			{
				i1+= (Integer.parseInt(String.valueOf(c)));
			}
			
		}
		System.out.print(sb+" "+i1);

	}

}
