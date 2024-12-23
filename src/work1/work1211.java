package work1;

public class work1211 {
	
	public static void main(String[] args) {
		
		int a = 6, b = 12;
		int plus = a + b;
		int times = a * b;
		
		System.out.println(plus);
		System.out.println(times);
		System.out.println("==================================");
		
		int eggs = 200, dozen = 12;
		int dozens = eggs/dozen;
		int left = eggs%dozen;
		
		System.out.println(dozens + "打");
		System.out.println(left + "顆");
		System.out.println("==================================");
		
		int secs = 256559;
		int mins = secs/60;
		int min = secs%60;
		int hours = mins/60;
		int hour = mins%60;
		int day = hours/24;
		int days = hours%24;
		
		System.out.println(day + "天");
		System.out.println(days + "時");
		System.out.println(hour + "分");
		System.out.println(min + "秒");
		System.out.println("==================================");
		
		final double PI = 3.1415;
		int r = 5;
		double circle = PI * PI * r;
		double circlelong = 2 * r * PI;
		
		System.out.printf("圓面積為 %.2f%n", circle);
		System.out.printf("圓周長為 %.2f%n", circlelong);
		System.out.println("==================================");
		
		double pv = 1500000 , n = 1.02;
		double nanswer = Math.pow(n, 10);
		double answer = pv * nanswer;
		
		System.out.println(answer);
		System.out.println("==================================");

		
		System.out.println(5 + 5); //單純整數相加
		System.out.println(5 + '5'); //'5'在unicode中為53，故為5+53=58
		System.out.println(5 + "5"); //整數5加上字串"5"將直接串連
		
		
		
		
		
		
		
		
		
	}
	

}
