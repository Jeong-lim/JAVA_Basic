package loopExample;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100)
				break; // sum�� 100���� ũ�� �Ǹ� ����������
			num ++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
