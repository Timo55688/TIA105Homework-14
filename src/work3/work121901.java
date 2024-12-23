package work3;

import java.util.Scanner;

public class work121901 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入：");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (istriangle(a, b, c)) {
			
			String triangletype = gettriangletype(a,b,c);
			System.out.println(triangletype);
		}
		else System.out.println("不是三角形");

	}

	public static boolean istriangle(int a, int b, int c) {

		return (a + b > c) && (a + c > b) && (b + c > a);
	}

	public static String gettriangletype(int a, int b, int c) {
		if (a == b && b == c) {
			return "正三角形";
		} else if (a == b || b == c || a==c) {
			return "等腰三角形";
		} else {
			return "就是三角形";
		}
	}
}
