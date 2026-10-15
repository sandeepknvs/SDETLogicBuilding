package day6.MaxConsecutiveMicroservices;

import java.util.List;

public class MaxConsecutiveServices {
	
	public static boolean checkFalse(String str)
	{
		for(char c:str.toCharArray())
		{
			if(c == 'N')
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = List.of(
			    "YYY", "YYY", "YNY", "YYY", "YNY",
			    "YYY", "YYY", "YYY", "NNN", "YYY",
			    "YNY", "YYY", "YYY", "YNY", "YYY",
			    "YYY", "NNN", "YYY", "YYY", "YYY",
			    "YYY", "YNY", "NNN", "YYY", "YNY",
			    "YYY", "YYY", "YYY", "YYY", "YNY",
			    "YYY", "NNN", "YNY", "YYY", "YYY",
			    "YYY", "YYY", "YYY", "YNY", "YYY",
			    "NNN", "YYY", "YYY", "YNY", "YYY",
			    "YYY", "YYY", "YNY", "YYY", "YYY",
			    "YYY", "YYY", "YYY", "YYY", "YYY",
			    "YNY", "YYY", "NNN", "YYY", "YYY",
			    "YYY", "YYY", "YNY", "YYY", "YYY",
			    "YYY", "YYY", "YYY", "YNY", "NNN",
			    "YYY", "YYY", "YYY", "YYY", "YYY",
			    "YYY", "YNY", "YYY", "YYY", "YYY",
			    "NNN", "YYY", "YNY", "YYY", "YYY",
			    "YYY", "YYY", "YYY", "YYY", "YNY",
			    "YYY", "YYY", "YYY", "YYY", "YYY",
			    "YYY", "YYY", "YNY", "YYY", "YYY"
			); 
		int streak = 0;
		int counter = 0;
		for(String lis:li)
		{
			boolean ans = checkFalse(lis);
			if(ans == true)
			{
				counter++;
			}
			else
			{
				if(counter >= streak)
				{
					streak = counter;
				}
				counter = 0;
			}
		}
		if(counter > streak)
		{
			streak = counter;
		}
		
		System.out.println(streak);

	}

}
