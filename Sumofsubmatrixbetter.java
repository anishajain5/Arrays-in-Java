package lecture_9;

public class Sumofsubmatrixbetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1 }, { 1, 1 } };
		System.out.println(sumbetter(arr));

	}

	public static int sumbetter(int[][] arr) {
		int m = arr.length;
		int sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				int tl = (i + 1) * (j + 1);
				int br = (m - i) * (m - j);
				sum = sum + (tl * br) * arr[i][j];
			}
		}
		return sum;
	}

}
