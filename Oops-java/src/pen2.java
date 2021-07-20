


public class pen2 {
	public static void main(String[] args) {
		//watch
		Inheritance m = new Inheritance();
		m.scrolldown();

		pen1 pen =new pen1();
		System.out.println(pen.color);
		System.out.println(pen.point);
		System.out.println(pen.type);
		
		System.out.println(pen.clicked);
		pen.click();
		System.out.println(pen.clicked);
	}

}
