package work5;

import java.util.*;

public class quiz1 {

	public static void starSquare(int width, int length) {

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形的長跟寬:");
		starSquare(sc.nextInt(), sc.nextInt());
		sc.close();
	}
}
