package Binary;

import java.util.Scanner;

public class FirstOccurence {
	
	static int firstOccurence(int[] arr, int x) {
		int low=0;
		int high = arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(x>arr[mid]) {
				low=mid+1;
			}
			else if(x<arr[mid]) {
				high=mid-1;
			}
			else{
				
			if(mid==0 || arr[mid-1]!=arr[mid]){
				return mid;
			}
			else high=mid-1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
	int[] arr = {5,10,10,10,20,20,50,55,55,60,60,88};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Enter number from given array:");
	Scanner sc = new Scanner(System.in);
	
	int x=sc.nextInt();;
	int index = firstOccurence(arr, x);
	if (index==-1) {
		System.out.println("Item not found.");
	}
	else
		System.out.println("First Occurence of given item at "+index);

	}

}
