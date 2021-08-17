public class MyOOP {

	public static void main(String[] args) {
		Print p1 = new Print("----"); // 인스턴스화
        p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****"); // 인스턴스화
        p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
        p2.A();
        p1.A();
        p2.A();
	}

}
