package classpart;

/* class 외부에는 import만 쓴다 */

/* class는 대부분 대문자로 시작 
 * 하나의 java 파일에 하나의 클래스를 두는 것이 원칙이나, 여러 개의
 * 클래스가 같이 있는 경우 public 클래스는 단 하나,
 * public 클래스와 자바 파일의 이름은 동일해야 함 
 * 
 * 자바의 모든 코드는 class 내부에 위치 */

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	} // 메소드
	
	/*
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울시 서초구 서초동";
		
		studentLee.showStudentInfor();
	} main을 이용해서 사용해보는 예시
	*/
	
	/* 자바 같은 경우는 크게 규칙이 존재하지는 않다.
	 * 단어가 바뀔 때 대문자로 써주면 된다.
	 *Package는 간단하게 말하면 소스의 묶음이다. 
	 *소스 계층 구조를 나타내준다. */
	
	/* 메서드는 함수의 일종
	 * 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수
	 * 
	 * 함수란?
	 * 하나의 기능을 수해하는 일련의 코드
	 * 중복되는 기능은 함수로 구현하여
	 * 함수를 호출하여 사용함 */
}
