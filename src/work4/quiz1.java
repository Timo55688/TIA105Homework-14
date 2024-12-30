package work4;

public class quiz1 {
	
	public static void main(String[] args) {

		int[] a = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int sum = 0;
		double avg = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.println(avg);
		System.out.println("=========");
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > avg) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
