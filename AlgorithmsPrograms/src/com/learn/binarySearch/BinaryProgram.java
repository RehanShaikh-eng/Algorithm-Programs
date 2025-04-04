package com.learn.binarySearch;
import java.util.*;
public class BinaryProgram {

	public static void main(String[] args) {

		// Creating the Array
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Length of an Array : ");
		int n = sc.nextInt();
		int[] arr = new int [n];
		
		//Storing Elements in the Array
		System.out.println("Enter Element To Be Inserted : ");
		for(int i = 0; i <= arr.length-1; i++ )
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter KEY to be Searched : ");
		int key = sc.nextInt();
		
		int low = 0;
		int high = arr.length-1;
		
		while (low <= high)
		{
			int mid = (low + high) / 2;
			
			if( arr [mid] == key)
			{
				System.out.println("KEY FOUND AT INDEX : " + mid);
				return;
			}
			
			else if (key > arr[mid])
			{
				low = mid + 1;
			}
			 
			else
			{
				high = mid - 1;
			}
		}
		
		System.out.println("KEY NOT FOUND");
	}

}
