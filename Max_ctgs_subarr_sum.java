
public class Max_ctgs_subarr_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 1, 5, -2, -4, 6 };
		System.out.println(max_sub(arr));

	}

	public static int max_sub(int arr[]) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + arr[k];
				}
				if (sum > max) {
					max = sum;
				}
			}
		}
		return max;
	}

}
