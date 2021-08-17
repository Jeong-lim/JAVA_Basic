class Foo{
	public static String classVar = "I class var";
	public String intanceVar = "I instance var";
	public String instanceVar;
	public static void classMethod() {
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); Error
	}
	public void instanceMethod() {
		System.out.println(classVar); // OK
		System.out.println(intanceVar); // OK
	}
}
public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
//		System.out.println(Foo.instanceVar); �ν��Ͻ��� �ν��Ͻ��� ���ؼ� ����� �� �ְ� ���ȵ� ���̴�.
		Foo.classMethod();
//		Foo.instanceMethod(); // instanceMethod�� �ν��Ͻ� �Ҽ��̾ class�� ���ؼ� ������ �� ����.
		
//		Class�� ���� �ٲٸ� instance�� ���� �ٲ��. instance�� ���� �ٲٸ� Class�� ���� �ٲ��..
//		f1���� �������� ����X f1�� classVar�� class Foo�� ����Ű�� ���� �� ���� �������� �ʴ´�.
//		instanceVar��� ������ Class�� ������ ������ �����Ѵ�. ���� link X ������ ���� ������ ���� �ʴ´�.
// 		instanceMethod�� instance�� �ִ� Method�� �������̴�.
		
		 Foo f1 = new Foo();
	     Foo f2 = new Foo();
//	      
	        System.out.println(f1.classVar); // I class var
	        System.out.println(f1.instanceVar); // I instance var
//	      
	        f1.classVar = "changed by f1";
	        System.out.println(Foo.classVar); // changed by f1
	        System.out.println(f2.classVar);  // changed by f1
//	      
	        f1.instanceVar = "changed by f1";
	        System.out.println(f1.instanceVar); // changed by f1
	        System.out.println(f2.instanceVar); // I instance var
	}

}