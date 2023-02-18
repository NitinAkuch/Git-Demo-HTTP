import java.util.Scanner;

public class SearchInUnsortedArray 
{

	public static int search(int arr1[], int n,int x) 
	{
		for(int i=0; i<n; i++)
		{
			if(arr1[i]==x)
				{
				System.out.println("number is found");
				System.out.println("The Index is "+i+".");

				return i;
				}
		}
		System.out.println("Number is not found.");
		return -1;
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {10,50,60,40,90,100,70,80,20,30};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to find: ");
		int x = sc.nextInt();
		System.out.println(search(arr, arr.length, x));
		
		
	}

	
}
