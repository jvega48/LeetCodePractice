package ArrayProblems;

import java.util.Arrays;

public class arrayDemo {
	//Remove Duplicates from Sorted Array
	// O(N)
	public static int removeDuple(int[] a) {
		if(a.length == 0) return 0;
		if(a.length == 1) return 1;
		
		int next = 1;
		for(int i = 1; i < a.length; i++) {
			if(a[i] != a[i -1]) {
				a[next] = a[i];
				next++;
			}
		}
		return next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,1,2};
		int[] b = {0,1,1,1,1,1,1,2,3,3,4};
		
		System.out.println(removeDuple(a));
		
	}

}
