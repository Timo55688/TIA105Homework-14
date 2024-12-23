package work2;

public class work121301 {
	public static void main(String[] args) {

		int sum1 = 0;
		for (int i = 1; i <= 1000; i++)
			if (i % 2 == 0) {
				sum1 += i;
			}

		System.out.println(sum1);
		System.out.println("====================================");

		int sum2 = 1;
		for (int i = 1; i <= 10; i++) {
			sum2 *= i;
		}

		System.out.println(sum2);
		System.out.println("====================================");

		int sum3 = 1;
		int i = 1;
		while (i <= 10) {
			sum3 *= i;
			i++;
		}
		
		System.out.println(sum3);
		System.out.println("====================================");

		int sum4 = 0;
		for (int a = 1; a <= 10; a++) {
			sum4 = a * a;
			System.out.print(sum4 + " ");
		}
	}
}
