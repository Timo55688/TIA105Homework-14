package work3;

import java.util.Scanner;

public class work121903 {

	public static void main(String[] args) {

		System.out.println("阿文...請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		if (num < 1 || num > 9) {
			System.out.println("只能選1~9");
			return;
		}
		
		for (int i = 1; i <= 49; i++) {
			if (unlike(i, num)) {
				System.out.print(i + " ");
			}
		}
	}

	public static boolean unlike(int num1, int num2) {
		while (num1 > 0) {
			int a = num1 % 10;
			if (a == num2) {
				return false;
			}
			num1 /= 10;
		}
		return true;
	}

}
