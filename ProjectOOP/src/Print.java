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
// static �̶�� ���� String�� Class�� �Ҽ��̶�� ��
// �� static�� class�� �Ҽ� 
// �����ڴ� �ʱ⿡ ������ �ʿ䰡 �ִ� ���� �����ϰų�, �Ǵ� �ʱ⿡ �۾��� ������ �� ����.
// this�� �� Ŭ������ �ν��Ͻ�ȭ �Ǿ��� ���� �ν��Ͻ��� ����Ű�� Ư���� �̸��̴�.	
}