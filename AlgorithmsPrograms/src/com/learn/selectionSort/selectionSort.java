package com.learn.selectionSort;
import java.util.*;
public class selectionSort {
	public static void main(String[] args)
	{
		Scanner ss = new Scanner (System.in);
		System.out.println("Enter length of an Array : ");
		int [] arr = new int [ss.nextInt()];
		
		System.out.println("Enter Elements to be Inserted : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = ss.nextInt();
		}
		
		System.out.println("Original Array is : ");
		for(int elem : arr)
		{
			System.out.print(elem + " ");
		}
		
		for(int i = 0 ; i <= arr.length-2; i++)
		{
			int pos = i;
			int min = arr[pos];
			for(int j = i+1; j <= arr.length-1; j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					pos = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println("Sorted Array is : ");
		for(int elem : arr)
		{
			System.out.println(elem + " ");
		}
	}

}
