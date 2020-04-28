package array_challenge;

import java.util.Scanner;

public class Sumof2_modified {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int[] a1 = new int[m];
		for (int i = 0; i < m; i++) {
			a1[i] = s.nextInt();
		}
		int n = s.nextInt();
		int[] a2 = new int[n];
		for (int i = 0; i < n; i++) {
			a2[i] = s.nextInt();
		}
		int max = 0;
		if (m >= n)
			max = m;
		else
			max = n;
		int[] res = new int[max + 1];
		int i = m - 1, j = n - 1, k = max;
		while (i >= 0 && j >= 0) {
			res[k] = res[k] + a1[i] + a2[j]; // you were reintializing it so it will not contain the carry
			if (res[k] >= 10) {
				res[k] = res[k] % 10;
				res[k - 1] = res[k - 1] + 1;
			}
			k--;
			j--;
			i--;
		}
		while (i >= 0) {
			res[k] += a1[i]; // same issue
			i--;
			k--;
		}
		while (j >= 0) {
			res[k] += a2[j]; // same issue
			j--;
			k--;
		}
		if (res[0] == 1) {
			System.out.print("1, ");
		}
		for (int x = 1; x < max + 1; x++) { // print
			System.out.print(res[x] + ", ");
		}
		System.out.print("END");

	}
}