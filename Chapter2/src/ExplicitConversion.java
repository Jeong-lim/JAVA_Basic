
public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // byte에 넣겠다고 명시적으로 설명
		
		System.out.println(iNum);
		System.out.println(bNum);
		// 데이터가 유실 될 수도 있고 오류가 날 수도 있다.
		
		double dNum = 3.14;
		iNum = (int)dNum; // 명시적 형변환
		System.out.println(iNum); // 소수점 이하는 X
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1); // 3
		System.out.println(num2); // 4
		
		// 결과가 왜 다를까?
		// 첫 번째는 더하기 전에 int로 변환
		// 두 개의 실수를 더한 다음에 int로 변환
	}
}
