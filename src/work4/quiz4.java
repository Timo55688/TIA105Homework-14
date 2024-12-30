package work4;

import java.util.*;

public class quiz4 {

	public static void main(String[] args) {

		int[] coNo = { 25, 32, 8, 19, 27 };
		int[] money = { 2500, 800, 500, 1000, 1200 };

		System.out.println("你想借多少?");

		Scanner sc = new Scanner(System.in);

		int bow = sc.nextInt();
		int people = 0;
		String a = "";

		for (int i = 0; i < money.length; i++) {
			if (bow <= money[i]) {
				people++;
				a += coNo[i] + " ";
			}
		}

		if (people <= 0) {
			System.out.println("你太貪婪了");
		} else {
			System.out.println("有錢可借的員工編號有:" + a + "共" + people + "人");
		}
	}
}
