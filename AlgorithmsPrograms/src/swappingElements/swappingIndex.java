package swappingElements;
import java.util.*;
public class swappingIndex {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Array Length : ");
		int [] arr = new int[sc.nextInt()];
		
		System.out.println("Enter Elements to be Inserted in Array : " );
		
		for(int i = 0; i <= arr.length-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the First Index : ");
		int index1 = sc.nextInt();
		
		System.out.println("Enter the Second Index : ");
		int index2 = sc.nextInt();
		
		if(index1 >= 0 &&  index1 <= arr.length-1 && index2 >= 0 && index2 <= arr.length-1)
		{
			System.out.println(" Before Swapping the Array the Elements are : " );
			for( int elem : arr)
			{
				System.out.print(elem+ " ");
			}
			
			System.out.println();
			
			int temp;
			temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			
			System.out.println("After Swapping the Array The Elements are : ");
			for(int elem : arr)
			{
				System.out.print(elem + " ");
			}
		}
		
		else 
		{
			System.out.println(" Invalid Indexes ");
		}
	}
}
