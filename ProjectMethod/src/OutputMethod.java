
public class OutputMethod {
					// 데이터 타입
	public static String a() {
		//...
		return "a"; // return 데이터 타입 문자열
	}
	
	public static int one() {
		return 1; 
		
		// Method의 return값 뒤에 있는 값이 그 Method의 실행 값이 된다.
		// return값은 Method를 종료시키는 값이 될 수도 있다.
	}
					// void는 return값이 없다.
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());

	}

}
