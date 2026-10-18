package day9.changingkeys;

public class ChangingKeys {

	public static void main(String[] args) {
		 int count = 0;
		 String s = "aAbBcC";

	        for (int i = 1; i < s.length(); i++) {
	            if (Character.toLowerCase(s.charAt(i)) !=
	                Character.toLowerCase(s.charAt(i - 1))) {
	                count++;
	            }
	        }
	        System.out.print(count);

	}

}
