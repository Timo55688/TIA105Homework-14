package work4;

public class quiz3 {

	public static void main(String[] args) {

		String[] a = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int vowel = 0;

		for (int i = 0; i < a.length; i++) {
			String name = a[i];
			
			for (int j = 0; j < a[i].length() ; j++) {
				char alphabet = name.charAt(j);
				if(compare(alphabet)) {
					vowel++;
				}
			}
		}
		System.out.println("總共有:" + vowel + "個母音哦");
	}
		//用switch case試試看
		public static boolean compare(char vowel) {
			if (vowel == '\u0061' || vowel == '\u0065' || vowel == '\u0069' 
					|| vowel == '\u006f' || vowel == '\u0075') {
				return true;
			}return false;
		}
}
