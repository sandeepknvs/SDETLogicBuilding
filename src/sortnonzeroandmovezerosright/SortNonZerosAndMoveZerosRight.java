package sortnonzeroandmovezerosright;

import java.util.Arrays;

public class SortNonZerosAndMoveZerosRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0, 1, 0, 2, 0, 3, 4, 0};
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] != 0) {
		        arr[index++] = arr[i];
		    }
		}

		Arrays.sort(arr, 0, index);

		while (index < arr.length) {
		    arr[index++] = 0;
		}
		
		for(int k : arr)
		{
			System.out.print(k+" ");
		}
		
	}

}
