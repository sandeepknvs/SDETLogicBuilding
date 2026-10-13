package day4.stringManipulation;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "a4b9c2d7";
		StringBuilder strg = new StringBuilder("");
		StringBuilder number = new StringBuilder("");
		StringBuilder reverse = new StringBuilder("");
		for(int i = 0; i < str.length(); i++)
		{
			char c = str.charAt(i);
			if(Character.isAlphabetic(c))
			{
				strg.append(c);
			}
			else if(Character.isDigit(c))
			{
				number.append(c);
			}
		}
		//System.out.println(strg);
		//System.out.println(number);
		int i = 0;
		int j = number.length()-1;
		while(i < strg.length() && j >= 0)
		{
			reverse.append(strg.charAt(i));
			reverse.append(number.charAt(j));
			i++;
			j--;
		}
		
		System.out.println(reverse);
	}
}
