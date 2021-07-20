
public class DoubleEx {
	
	int abc; // 멤버 변수

	public static void main(String[] args) {
		var dNum = 3.14;
		//float fNum = 3.14; // double은 8바이트고 float는 4바이트기 때문에 오류가 난다.
		float fNum = 3.14F;
		
		System.out.println(dNum);

		var num = 10;
		System.out.println(num);
		
		// num = 3.14;
	}

}
