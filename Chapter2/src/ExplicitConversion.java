
public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // byte�� �ְڴٰ� ��������� ����
		
		System.out.println(iNum);
		System.out.println(bNum);
		// �����Ͱ� ���� �� ���� �ְ� ������ �� ���� �ִ�.
		
		double dNum = 3.14;
		iNum = (int)dNum; // ����� ����ȯ
		System.out.println(iNum); // �Ҽ��� ���ϴ� X
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1); // 3
		System.out.println(num2); // 4
		
		// ����� �� �ٸ���?
		// ù ��°�� ���ϱ� ���� int�� ��ȯ
		// �� ���� �Ǽ��� ���� ������ int�� ��ȯ
	}
}
