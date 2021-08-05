
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		
	int i = 0;
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
			i++;
		}
		System.out.println("===for===");
		for(int j= 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}
		System.out.println(4);
	}
	// 디버그 단계별로 확인하는거 F6
	// break point를 찍고 확인하기
}
