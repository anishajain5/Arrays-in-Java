package lecture_7;

public class Spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		int dir = 1;
		int top = 0;
		int bottom = arr.length - 1;
		int left = 0;
		int right = arr[top].length - 1;
		int count = (bottom + 1) * (right + 1);
		while (left <= right && top <= bottom) {
			if (count > 0) {
				if (dir == 1) {
					for (int i = left; i <= right; i++) {
						System.out.print(arr[top][i] + ", ");
						count--;
					}
				}

				dir = 2;
				top++;
			}
			if (count > 0) {
				if (dir == 2) {
					for (int i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + ", ");
						count--;
					}
				}
				dir = 3;
				right--;
			}
			if (count > 0) {
				if (dir == 3) {
					for (int i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + ", ");
						count--;
					}
				}
				bottom--;
				dir = 4;
			}
			if (count > 0) {
				if (dir == 4) {
					for (int i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + ", ");
						count--;
					}
				}
				dir = 1;
				left++;
			}

		}
		System.out.println("END");
	}
}
