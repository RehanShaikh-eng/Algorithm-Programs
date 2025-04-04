package usingBubbleSortTechnique;

import java.util.Arrays;

public class bubbleSortTechnique {
	public static void main(String[] args)
	{
		int[] arr = new int [6];
		arr[0] = 40;
		arr[1] = 50;
		arr[2] = 10;
		arr[3] = 30;
		arr[4] = 20;
		arr[5] = 60;
		
		System.out.println("Original Array : ");
		for(int elem : arr)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Arrays is : ");
		for(int elem : arr)
		{
			System.out.print(elem +" ");
		}
		
	}
}
