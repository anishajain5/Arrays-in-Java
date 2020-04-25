package lecture_9;

public class Sum_of_submatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 1 }, { 1, 1 } };
		System.out.println(sumsub(arr));

	}

	public static int sumsub(int[][] m) {
		int sum = 0;
		for (int tli = 0; tli < m.length; tli++) {
			for (int tlj = 0; tlj < m.length; tlj++) {
				for (int bri = tli; bri < m.length; bri++) {
					for (int brj = tlj; brj < m.length; brj++) {
						for (int i = tli; i <= bri; i++) {
							for (int j = tlj; j <= brj; j++) {
								sum = sum + m[i][j];
							}
						}
					}
				}
			}
		}
		return sum;
	}

}
