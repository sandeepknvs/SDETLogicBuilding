package day10.rotatearrayleft;

public class RotateArrayLeft {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int j = arr[arr.length - 1];
		for(int i = arr.length-1; i > 0; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = j;
		
		for(int i : arr)
		{
			System.out.println(i);
		}

	}

}
