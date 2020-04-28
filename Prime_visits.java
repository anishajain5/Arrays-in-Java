package array_challenge;

import java.util.Scanner;

public class Prime_visits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int test = s.nextInt();
		while (test > 0) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println(soe(a, b));
			test--;
		}

	}

	public static int soe(int a, int b) {
		boolean[] primes = new boolean[b + 1];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}
		primes[0] = false;
		primes[1] = false;
		int n2test = 2;
		while (n2test * n2test <= b) {
			if (primes[n2test] == true) {
				for (int multiplier = 2; n2test * multiplier <= b; multiplier++) {
					primes[n2test * multiplier] = false;
				}
			}
			n2test++;
		}
		int count = 0;
		for (int i = a; i <= b; i++) {
			if (primes[i] == true) {
				count++;
			}
		}
		return count;
	}

}
