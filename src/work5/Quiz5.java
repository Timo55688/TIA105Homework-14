package work5;

public class Quiz5 {
	
	public static void main(String[] args) {
		
		Quiz5 qu = new Quiz5();
		
		System.out.println("本次隨機產生的驗證碼為：");
		
		int a = 0;
		char[] def = new char[8];
		for (int i = 0; i < def.length; i++) {
			def[i] = qu.genAuthCode(a);
			System.out.print(def[i]);
		}
	}
	
	public static char genAuthCode(int a) {
		int caseNum = (int)(Math.random()*3);
		int random = 0;
		switch(caseNum){
			case 0:
				random = (int)(Math.random()*10+48);
				break;
			case 1:
				random = (int)(Math.random()*26+65);
				break;
			case 2:
				random = (int)(Math.random()*26+97);
				break;
		}
		char a1 = (char) random ;
		return a1;
	}
	
}
