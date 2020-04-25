package lecture_9;

public class Merge_sorted_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 5, 7, 9, 11 };
		int[] arr2 = { 2, 4, 8, 11, 14 };
		merge(arr1, arr2);

	}

	public static void merge(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0, j = 0, k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				ans[k] = one[i];
				k++;
				i++;
			} else {
				ans[k] = two[j];
				k++;
				j++;
			}
		}
		while (i < one.length) {
			ans[k] = one[i];
			k++;
			i++;
		}
		while (j < two.length) {
			ans[k] = two[j];
			j++;
			k++;
		}
		print(ans);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
