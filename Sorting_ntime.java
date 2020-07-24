package array_challenge;

import java.util.Scanner;

public class Sorting_ntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int [] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int mid=0;
		int low=0;
		int high=n-1;
		while(mid<=high) {
			if(arr[mid]==0) {
				swap(arr,low,mid);
				low++;
				mid++;
							
			}
			else if(arr[mid]==1) {
				mid++;
				
			}
			else {
				swap(arr,mid, high);
				high--;
				
				
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		

	}
	public static void swap(int [] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
