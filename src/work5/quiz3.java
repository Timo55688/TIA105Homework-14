package work5;

public class quiz3 {

	public static void main(String[] args) {

		int[][] a = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] b = { { 1.2, 3.6, 7.8, 9.3, 6.8, 1.9 }, { 6.8, 2.9, 4.8, 1, 8, 4, 9 } };

		System.out.println(getMax(a));
		System.out.println(getMax(b));

	}

	public static double getMax(double[][] a) {

		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}
	public static double getMax(int[][] a) {

		double max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		return max;
	}

}
