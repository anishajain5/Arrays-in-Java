package array_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sum_pair {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		int l=0;
		int r=n-1;
		Arrays.sort(arr);
		while(l<r) {
			if(arr[l]+arr[r]==target) {
				System.out.println(arr[l]+" and "+arr[r]);
				l++;
				r--;
			}
			else if(arr[l]+arr[r]>target) {
				r--;
			}
			else {
				l++;
			}
		}
	}

}
