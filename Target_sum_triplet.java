package array_challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sum_triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		
		Arrays.sort(arr);
		for(int i=0;i<n;i++) {
			int l=i+1;
			int r=n-1;
			int nt=target-arr[i];
			while(l<r) {
				if(arr[l]+arr[r]==nt) {
					System.out.println(arr[i]+", "+arr[l]+" and "+arr[r]);
					l++;
					r--;
				}
				else if(arr[l]+arr[r]>nt) {
					r--;
				}
				else {
					l++;
				}
			}
		}

	}

}
