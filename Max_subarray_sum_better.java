package lecture_9;

public class Max_subarray_sum_better {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println(maxsubarr(arr));

	}

	public static int maxsubarr(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

}
