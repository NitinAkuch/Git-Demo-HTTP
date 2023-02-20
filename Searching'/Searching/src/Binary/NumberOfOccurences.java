package Binary;

import java.util.Scanner;

public class NumberOfOccurences {

	static int firstOccurence(int[] arr, int L, int x) {
		int low=0;
		int high = L-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]<x) {
				low = mid + 1;
			}
			else if (arr[mid]>x) {
				high = mid -1;
			}
			else {
				if(mid==0 || arr[mid-1]!=arr[mid])
					return mid;
				else
					high = mid-1;
			}
		}
				
		return -1;
	}
	
	
	static int lastOccurence(int[] arr, int L, int x) {
		int low = 0;
		int high = L-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<x) {
				low = mid+1;
			}
			else if(arr[mid]>x) {
				high = mid-1;
			}
			else
			{
				if(mid==L-1 || arr[mid+1]!=arr[mid])
					return mid;
				else
					low=mid+1;
			}
		}
		
		return -1;
	}
	
	
	static int countOccurence(int[] arr, int L, int x) {
		int first = firstOccurence(arr, L, x );
		int last = lastOccurence(arr, L, x);
		if(first==-1)
			return 0;
		else 
			return (last-first+1);
	}
	
	public static void main(String[] args) {
		int[] arr = {5,10,10,10,20,20,50,55,55,60,60,88};
		int L = arr.length;
		for(int i=0; i<L; i++) {
			System.out.print(""+arr[i]+" ");
		}
		System.out.println("");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter item to find out the number of occurence of item in given array");
		int x = sc.nextInt();
		
		int count = countOccurence(arr, L, x);
		System.out.println("");
		System.out.println("The number occured in given array is: "+count);

	}

}
