package com.missingNumber;
import java.util.Scanner;
public class findMissingNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		//Creating an Array
		System.out.println("Enter The N Value : ");
		int n = sc.nextInt();
		int arr[] = new int [n-1];
		
		//Storing Elements in the Array
		System.out.println("Enter The Numbers To be Inserted in Array : ");		
		for(int i = 0; i<= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//Finding the Sum of N Natural Numbers
		int totalSum = n*(n+1)/2;
		int arrSum = 0;
		
		// Traversing the Array and Calculating the Sum of Elements 
		for (int i = 0; i <= arr.length-1; i++)
		{
			arrSum += arr[i];
		}
		// calculating the Sum
		int missingNum = totalSum - arrSum;
		System.out.println("Missing num is : " + missingNum);
	}

}
