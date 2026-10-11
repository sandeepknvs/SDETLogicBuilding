package day2.monotonicArray;

public class MonotonicArray {
	
	public static boolean checkAscendingOrder(int arr[])
	{
		int length = arr.length;
		int j = 0;
		int i = j+1;
		while(i > length)
		{
			/*if(arr[i] >= arr[j])
			{
				continue;
			}*/
		    if(arr[i] < arr[j])
			{
				return false;
			}
			
			i++;
			j++;
		}

		return true;
	}

	public static boolean checkDescendingOrder(int arr[])
	{
		int length = arr.length;
		int j = 0;
		int i = j+1;
		while(i < length)
		{
//			if(arr[i] <= arr[j])
//			{
//				continue;
//			}
			if(arr[i] > arr[j])
			{
				return false;
			}
			i++;
			j++;
		}
		return true;
	}
	public static void main(String[] args) {
		int arr[] = {1,1,1};
		boolean ans = true; 
		if(arr.length <= 2)
		{
			ans = true;
		}
		
		if(arr.length > 2)
		{
			if(arr[1] > arr[0])
			{
				ans = checkAscendingOrder(arr);
			}
			else if(arr[0] == arr[1])
			{
				ans = checkAscendingOrder(arr) || checkDescendingOrder(arr);
			}
			else 
			{
			    ans = checkDescendingOrder(arr);
			}
		}
		System.out.println(ans);
	}

}
