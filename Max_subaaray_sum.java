package array_challenge;

import java.util.Scanner;

public class Max_subaaray_sum {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int [] arr= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			System.out.println(kadanes(arr));
			t--;
		}
	}
	public static int kadanes(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if (sum < 0) {
				sum = 0;
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}


}
