package work3;

import java.util.Scanner;

public class work121902 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 10);

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");

		while (true) {
			int guess = sc.nextInt();

			if (guess == a) {
				System.out.println("答對了!答案就是" + a);
				break;
			}else {
				System.out.println("猜錯囉");
			}

		}
	}
}
