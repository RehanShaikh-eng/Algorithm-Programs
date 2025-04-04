package com.swapping;
import java.util.*;
public class swapppingNumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number : " );
		int num2 = sc.nextInt();
		
		System.out.println(" Before Swapping The Number : " + num1 + " " + num2 );
		
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After Swapping The Number : " + num1 + " " + num2);
	}

}
