package day11.rotateAnArray;

public class RotateAnArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		rotateArray(arr,k);
		for(int f: arr)
		{
			System.out.print(f+" ");
		}

	}

	private static void rotateArray(int[] arr, int k) {
		// TODO Auto-generated method stub
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
		
		
	}

	private static void reverse(int[] arr, int i, int j) {
		while(i < j)
		{
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		
		
	}

}
