package work4;

import java.util.Arrays;

public class quiz6 {

	public static int getMax(int[] a) {
		int max = a[0];
		int no = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				no = i + 1;
			}
		}
		return no - 1;
	}

	public static void main(String[] args) {

		int[] a = { 10, 35, 40, 100, 90, 85, 75, 70 };
		int[] b = { 37, 75, 77, 89, 64, 75, 70, 95 };
		int[] c = { 100, 70, 79, 90, 75, 70, 79, 90 };
		int[] d = { 77, 95, 70, 89, 60, 75, 85, 89 };
		int[] e = { 98, 70, 89, 90, 75, 90, 89, 90 };
		int[] f = { 90, 80, 100, 75, 50, 20, 99, 75 };

		quiz6 ab = new quiz6();

		int a1 = quiz6.getMax(a);
		int b1 = quiz6.getMax(b);
		int c1 = quiz6.getMax(c);
		int d1 = quiz6.getMax(d);
		int e1 = quiz6.getMax(e);
		int f1 = quiz6.getMax(f);

		int[] total = { a1, b1, c1, d1, e1, f1 };
		int[] result = { 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < total.length; i++) {
			result[total[i]]++;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println("第" + (i + 1) + "位同學拿過" + result[i] + "次第一名");
		}

//		System.out.println(Arrays.toString(result));

	}

}
