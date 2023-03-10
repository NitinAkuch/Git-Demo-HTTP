package Binary;
import java.util.Scanner;


public class LastOccurence {

	public static void main(String[] args) {
		int[] arr = {5,10,10,10,20,20,50,55,55,60,60,88};
		int L = arr.length;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<L;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("Size of the Array: "+L);
		
		System.out.println("Enter number from given array:");
		int x = sc.nextInt();
		LastOccurence LC = new LastOccurence();
		int lastIndex = LC.lastOccurence(arr,x, L);
		if (lastIndex==-1) {
			System.out.println("Item Not Found.");
		}
		else
			System.out.println("Last Occurence of given item at: "+lastIndex);
	}
	
	public int lastOccurence(int[] arr, int x, int n) {
		int low=0;
		int high = n-1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]<x) {
				low = mid+1;
			}
			else if(arr[mid]>x) {
				high=mid-1;
			}
			else {
				if(mid == n-1 || arr[mid+1] != arr[mid]) //Important Repeat again and again.
														//Same problem on GFG is wrong. i.e.mid == n-1==>right
														//									mid != n-1==>Wrong
					return mid;
				else
					low=mid+1;
			}
				
		}
			
		return -1;
	}

}
