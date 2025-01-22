package work5;

public class quiz2 {

	public static int getAvg(int[] a) {

		int sum = 0;
		int avg = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			avg = sum / a.length;
		}
		return avg;
	}

	public static void main(String[] args) {

		quiz2 ra = new quiz2();
		
		System.out.println("本次亂數結果：");
		
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(quiz2.getAvg(a));
	}
}
