package work6;

public class Calculator {
	
	public static void powerXY(int a, int b) throws CalException {
		
		int result;
	
		if (a == 0 && b == 0) {
			throw new CalException("0的0次方有意義嗎?");
		}
		
		if (a < 0 ) {
			throw new CalException("請問負數有次方嗎?");
		}
		
		
		
		result = (int) Math.pow(a, b);
		System.out.println(a+"的"+b+"次方等於"+result);
		
	}
}
