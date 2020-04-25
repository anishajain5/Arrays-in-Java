package lecture_9;

public class Kadanes_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println(kadanes(arr));

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
