
public class Ex2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; //항상 초기화해주는 것!
		
		System.out.println("x:" + x + " y:" + y); //변수가 초기화 되지 않음!
	
		tmp = x;
		x = y;
		y= tmp;
		
		System.out.println("x:" + x + " y:" + y);
		
		//결과값 
		//x:10 y:20
		//x:20 y:10

	}

}
