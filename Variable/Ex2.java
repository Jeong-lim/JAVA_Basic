
public class Ex2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; //�׻� �ʱ�ȭ���ִ� ��!
		
		System.out.println("x:" + x + " y:" + y); //������ �ʱ�ȭ ���� ����!
	
		tmp = x;
		x = y;
		y= tmp;
		
		System.out.println("x:" + x + " y:" + y);
		
		//����� 
		//x:10 y:20
		//x:20 y:10

	}

}
