package Binary;

import java.util.Arrays;

public class BinarySearchByBuiltinMethod {
	
	public static void main(String[] args) {
		int[] arr1 = {10,30,80,40,5,47,25,5,2,5,5,255,45};
		Arrays.sort(arr1);
		for(int k=0; k<arr1.length; k++) {
			System.out.print(" "+arr1[k]);
			System.out.println();
		}
		int i = Arrays.binarySearch(arr1,30);
		System.out.println(i);
	}
	
	

}
