package day8.countofnumbersafterdecimal;

public class CountOfNumbersAfterDecimal {

	public static void main(String[] args) {
		double number = 123456.89788;
		String strNumber = String.valueOf(number);
		int index = strNumber.indexOf('.');
		System.out.println(strNumber.length()-index-1);

	}

}
