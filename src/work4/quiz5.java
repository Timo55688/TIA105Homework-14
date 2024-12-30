package work4;

import java.util.*;

public class quiz5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("輸入年份：");
		int y = sc.nextInt();
		System.out.println("輸入月份：");
		int m = sc.nextInt();
		System.out.println("輸入日期：");
		int d = sc.nextInt();

		int[] day = { 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int days = 0;

		if (year4th(y)) {
			day[1] = 29;
		} else {
			day[1] = 30;
		}

		for (int i = 0; i < m - 1; i++) {
			days += day[i];
		}
		System.out.println("輸入日期為該年的第" + (days + d )+ "天");
	}

	public static boolean year4th(int y) {
		if (y % 4 == 0 && y % 100 != 0 && y % 400 != 0) {
			return true;
		}
		return false;
	}
}
