public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); // 문자 출력
		System.out.println((int)ch1); // 문자에 해당하는 정수 값(아스키코드 값) 출력
		// A는 아스키코드 값이 65이다.
		
		char ch2 = 66; // 정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력
		// 66이라는 아스키코드값의 문자는 B이다.
		// 애초에 char로 선언을 했기 때문에 따로 형변환은 안해줘도 된다.
 		
		int ch3 = 67;
		System.out.println(ch3); // 문자 정수 값 출력
		System.out.println((char)ch3); // 정수 값에 해당하는 문자 출력

	}

}
