package lecture_7;

import java.util.Scanner;

public class Wave_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		input(arr, m, n);
		wave(arr);

	}

	public static void input(int[][] arr, int m, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

	}

	public static void display(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void wave(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + ",");
				}
			} else {
				for (int j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + ",");
				}
			}
		}
		System.out.print("END");
	}

}