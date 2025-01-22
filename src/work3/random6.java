package work3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class random6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("輸入討厭的數字:");
		int unlike = sc.nextInt();
		if (unlike >= 10 || unlike < 0) {
			System.out.println("無效數字");
		}

		int result = (int) (Math.random() * 50);
		for (int i = 1; i < 50; i++) {
			if (i % 10 != unlike && i / 10 != unlike) {
				result = i;
				System.out.print(result + " ");
			}
		}
		System.out.println();

//		HashSet set = new HashSet();
		TreeSet set = new TreeSet(); // 直接幫你排(自然)順序
		while (set.size() != 6) {
			int r = (int) (Math.random() * 50);
			if (r % 10 != unlike && r / 10 != unlike) {
				set.add(r);
			}
		}

		Iterator it = set.iterator();
		while (it.hasNext())
			System.out.print(it.next() + " ");

		sc.close();
	}
}
