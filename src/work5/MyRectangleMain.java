package work5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
		
		MyRectangle mr = new MyRectangle(20,20);
		
		mr.setDepth(10);
		mr.setWidth(10);
		
		System.out.println(mr.getArea());
		
		MyRectangle mr2 = new MyRectangle(20,20);
		
		System.out.println(mr2.getArea());
	}

}
