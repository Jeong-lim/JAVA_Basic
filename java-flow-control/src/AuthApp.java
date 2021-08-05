
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "jeonglim";
		String inputId = args[0];
		
		String pass = "1111"; 
		String inputPass = args[1]; // run configuration에서 값 두개 줄때는 한 칸 띄어서 쓰기
		
		System.out.println("Hi.");
		
		//if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputpass.equals(password)) {
//			System.out.println("Master!");
//		} else {
//			System.out.println("Wrong password!");
//		}
//	} else {
//			System.out.println("Who are you?");
//		}
		if(inputId.equals(id) && inputPass.equals(pass)) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
		
	}

}
