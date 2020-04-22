package lecture_6;

public class Sorting_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 1, 4, 2, 6, 9 };
		selection(arr);
		print(arr);

	}

	public static int[] insertion(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
				swap(arr, j, j - 1);
			}
		}
		return (arr);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static int[] bubble(int[] arr) {
		for (int pass = 1; pass <= arr.length - 1; pass++) {
			for (int j = 0; j < arr.length - pass; j++) {
				if (arr[j] > arr[j + 1])
					swap(arr, j, j + 1);
			}
		}
		return (arr);
	}

	public static int[] selection(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = 1;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}

			}
			swap(arr, i, min);
		}
		return arr;
	}

}
