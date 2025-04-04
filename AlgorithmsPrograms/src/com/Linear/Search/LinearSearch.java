package com.Linear.Search;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Array : ");
		//Creating an Array
		int [] arr = new int [sc.nextInt()];
		System.out.println("Enter Element to be Intserted in Array : ");
		// Storing Elements in The Array
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the key Which You want to Find : ");
		int key = sc.nextInt();
		
		// Traversing the Array
		for(int i = 0; i <= arr.length-1; i++)
		{
			// Checking whether current element is equal to key 
			if (key == arr[i])
			{
				System.out.println("Key is Found and Present in Index : " + (i+1));
				return;
			}
		}
			// If key is not found
			System.out.println("Key is Not Found");
		}
	}