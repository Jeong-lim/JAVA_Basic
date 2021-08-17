class Print {
	public String delimiter  = "";
	public Print(String delimiter) {
		this.delimiter = delimiter;
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
// static 이라는 것은 String은 Class의 소속이라는 것
// 즉 static은 class의 소속 
// 생성자는 초기에 주입할 필요가 있는 값을 전달하거나, 또는 초기에 작업을 수행할 때 쓴다.
// this는 그 클래스가 인스턴스화 되었을 때에 인스턴스를 가르키는 특수한 이름이다.	
}