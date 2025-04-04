package lastOccuranceNumber;
import java.util.*;
public class lastOccuranceNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		// Creating an Array
		System.out.println("Enter a Length of Array : ");
		int [] arr = new int[sc.nextInt()];
		
		// Storing Elements in The Array
		System.out.println("Enter Number to be Inserted : ");
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a KEY You want to Search : ");
		int key = sc.nextInt();
		
		// Creating Variable to hold the index if key is present
		int index = -1;
		
		// Traversing the Array
		for(int i = 0; i <= arr.length-1; i++)
		{
			// Checking whether current Element is Equal to KEY
			if( arr[i] == key)
			{
				// if KEY is Present , Storing its Index
				index = i;
			}
		}
		
		// Checking if Index is -1 , means KEY not Found
		if(index == -1)
		{
			System.out.println("Key Not Founded");
		}
	
	// Otherwise printing the last Occurrence of Element
		else
		{
			System.out.println("Last Occurrence is at index : " + index);
		}
	}
}
