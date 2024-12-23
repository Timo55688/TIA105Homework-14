package work2;

public class work121302 {

	public static void main(String[] args) {
		int sum1 = 0;
		for (int i = 0; i <= 4; i++) {
			if (i == 4) {
				continue;
			}
			for (int j = 1; j <= 10; j++) {
				if (j == 4) {
					continue;
				}
				sum1 = i * 10 + j;
				if (sum1 != 40)
					System.out.println(sum1);
			}
		}

		System.out.println("==================================");

		int sum2 = 0;
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();

		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= i; j--) {
				if (j % 2 == 0) {
					continue;
				}
				System.out.print(j + " ");
			}

			System.out.println();
		}

		System.out.println("==================================");
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) ('A' + i - 1));
			}
			System.out.println();
		}

	}
}
