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
//		System.out.println(Foo.instanceVar); 인스턴스는 인스턴스를 통해서 사용할 수 있게 고안된 것이다.
		Foo.classMethod();
//		Foo.instanceMethod(); // instanceMethod는 인스턴스 소속이어서 class를 통해서 접근할 수 없다.
		
//		Class의 값을 바꾸면 instance의 값이 바뀐다. instance의 값을 바꾸면 Class의 값이 바뀐다..
//		f1에는 실제값은 존재X f1의 classVar은 class Foo를 가르키고 있을 뿐 값이 존재하지 않는다.
//		instanceVar라는 변수는 Class의 값까지 복제가 가능한다. 서로 link X 서로의 값에 영향을 받지 않는다.
// 		instanceMethod는 instance에 있는 Method와 독립적이다.
		
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
