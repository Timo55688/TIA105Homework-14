package work6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("請輸入x的值:");
		int x = sc.nextInt();
		System.out.println("請輸入y的值:");
		int y = sc.nextInt();
		
		try {
			Calculator.powerXY(x, y);
		} catch(CalException abc) {
			System.out.println(abc);
		} catch(InputMismatchException e) {
			
			System.out.println("請問輸入的是數字嗎?");
		}
		
		sc.close();
	}
}
