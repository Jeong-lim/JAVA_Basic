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
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) { // �Ű�����
		studentName = name;
	} // ����ϴ� �ڵ��� ���忡�� ����.
	
	public static void main(String[] args) {
		// ���� ���� ����Ǵ� �κ�
		
		Student studentLee = new Student(); //������ default ������
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 111;
		studentKim.address = "��⵵ ���� �ֿ���";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
	}
}
	
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

