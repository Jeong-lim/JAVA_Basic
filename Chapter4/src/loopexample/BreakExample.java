package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) {
			sum += num;
			if(sum > 100)
				break; // sum이 100보다 크게 되면 빠져나가라
			num ++;
		}
		
		System.out.println(sum);
		System.out.println(num);
	}

}
