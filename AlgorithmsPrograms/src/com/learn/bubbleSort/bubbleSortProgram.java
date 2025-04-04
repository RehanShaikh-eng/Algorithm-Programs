package com.learn.bubbleSort;
import java.util.*;
public class bubbleSortProgram {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Length of Array : ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("Enter Elemenets To Be Inserted in The Array : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array : ");
		for(int elem : arr )
		{
			System.out.println(elem + " ");
		}
		
		int temp ;
		for(int i = 0 ; i <= n-2; i++)
		{
			for(int j = 0; j <= n-2; j++)
			{
				if(arr[i] < arr [j])
				{
					temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array is : ");
		for(int elem : arr)
		{
			System.out.println(elem + " ");
		}
	}
}