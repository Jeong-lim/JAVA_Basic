public class MyOOP {

	public static void main(String[] args) {
		Print p1 = new Print(); // �ν��Ͻ�ȭ
        p1.delimiter = "----"; 
        p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print(); // �ν��Ͻ�ȭ
        p2.delimiter = "****"; 
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
