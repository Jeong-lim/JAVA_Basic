package classpart;

/* class �ܺο��� import�� ���� */

/* class�� ��κ� �빮�ڷ� ���� 
 * �ϳ��� java ���Ͽ� �ϳ��� Ŭ������ �δ� ���� ��Ģ�̳�, ���� ����
 * Ŭ������ ���� �ִ� ��� public Ŭ������ �� �ϳ�,
 * public Ŭ������ �ڹ� ������ �̸��� �����ؾ� �� 
 * 
 * �ڹ��� ��� �ڵ�� class ���ο� ��ġ */

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	} // �޼ҵ�
	
	/*
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����� ���ʱ� ���ʵ�";
		
		studentLee.showStudentInfor();
	} main�� �̿��ؼ� ����غ��� ����
	*/
	
	/* �ڹ� ���� ���� ũ�� ��Ģ�� ���������� �ʴ�.
	 * �ܾ �ٲ� �� �빮�ڷ� ���ָ� �ȴ�.
	 *Package�� �����ϰ� ���ϸ� �ҽ��� �����̴�. 
	 *�ҽ� ���� ������ ��Ÿ���ش�. */
	
	/* �޼���� �Լ��� ����
	 * ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	 * 
	 * �Լ���?
	 * �ϳ��� ����� �����ϴ� �Ϸ��� �ڵ�
	 * �ߺ��Ǵ� ����� �Լ��� �����Ͽ�
	 * �Լ��� ȣ���Ͽ� ����� */
}
