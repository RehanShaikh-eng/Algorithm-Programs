package binarySearchOnArray;
import java.util.*;
public class BinarySearchOnArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Array Length : ");
		int n = sc.nextInt();
		int [] arr = new int [n];
		
		System.out.println("Enetr Elements To be Inserted : ");
		for(int i = 0 ; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Original Array is : ");
		for(int elem : arr)
		{
			System.out.print(elem + " ");
		}
		System.out.println();
		
		// Performing Sorting
		int [] sortArr = bubbleSort(arr, n);
		
		System.out.println("Enter The Key which you have to Searched : ");
		int key = sc.nextInt();
		
		// Performing Searching
		binarySearch(arr,key);
		
	}	
		static int[] bubbleSort (int [] arr , int n)
		{
			int temp;
			for(int i = 0; i <= n-2; i++)
			{
				for(int j = 0 ; j <= n-2-i; j++)
				{
					if(arr[j] > arr[j+1])
					  {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					  }
				}
			}
			return arr;
		}
		
	static void binarySearch (int[] arr , int key)
	{
			int low = 0;
			int high = arr.length-1;
		while (low <= high)
		 {
				int mid = (low + high)/2;
			if(arr[mid] == key)
			{
				System.out.println("KEY Found at Index : " + mid);
				return;
			}
			else if ( key > arr[mid])
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}
		}
		System.out.println("KEY Not Found");
	}
}
