
public class WhyMethod {
									//�Է°��� args�� ���´�
	public static void main(String[] args) {
		
		//����, argument
        printTwoTimes("a", "-");
        // 100000000
        printTwoTimes("a", "*");
        // 100000000
        printTwoTimes("a", "&");
        printTwoTimes("b", "!");

	}
    								//�Ű�����,parameter �迭
    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }



}
