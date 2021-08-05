
public class LoopArray {

	public static void main(String[] args) {
		/*
		 * <li>jeonglim</li>
		 * <li>junheok</li>
		 * <li>egoing</li>
		 */
		
		String[] users = new String[3];
		users[0] = "jeonglim";
		users[1] = "junheok";
		users[2] = "egoing";
		
		for(int i=0; i<3; i++) {
			System.out.println("<li>"+users+"<li>");
		}
	}

}
