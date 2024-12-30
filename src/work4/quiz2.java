package work4;

import java.util.*;

public class quiz2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("在這邊輸入正能量：");
		
		String s = sc.nextLine();
		String t = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			t += s.charAt(i);
		}
		System.out.println(t);
	}

}
