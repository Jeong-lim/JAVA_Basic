
public class AuthApp3 {

	public static void main(String[] args) {
		
		// String[] users = {"egoing", "jeonglim", "youbin"};
		// 정렬 안의 정렬
		String[][] users =  {
				{"egoing", "1111"},
				{"jinhuck", "2222"},
				{"youbin", "3333"}
		};
				// users의 원소가 배열이고 각각의 배열에 원소의 값이 String인 것
		String inputId = args[0];
		String inputPass = args[1];
		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String [] currentId = users[i];
			if(		currentId[0].equals(inputId) &&
					currentId[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi,");
		if(isLogined) {
			System.out.println("Master!!");
		} else {
			System.out.println("Who are you!!");
		}
	}

}
