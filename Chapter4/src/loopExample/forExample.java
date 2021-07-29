package loopExample;

public class forExample {

	public static void main(String[] args) {
		
		int dan = 2;
		int times = 1;
		
		
		for(dan = 2; dan <= 9; dan++) {
			
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "X" + times + "=" + dan*times);
			}
			System.out.println(); // °³Çà
		}
		
		while(dan <=9) {
			while(times <= 9) {
				System.out.println(dan + "X" + times + "=" + dan*times);
				times++;
			}
			dan++;
			System.out.println();
		}
	}

}
