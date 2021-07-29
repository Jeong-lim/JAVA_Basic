
public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		double dNum = fNum + num;
		System.out.println(dNum);
		
		// 컴파일러가 임의로 형변환을 하지 못한다
		// 프로그래머가 명시적으로 형변환을 해줘야한다
		
	}

}
